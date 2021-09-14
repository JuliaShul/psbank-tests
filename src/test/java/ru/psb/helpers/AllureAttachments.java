package ru.psb.helpers;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.addAttachment;
import static io.restassured.RestAssured.sessionId;
import static org.openqa.selenium.logging.LogType.BROWSER;

public class AllureAttachments {
    private static final Logger LOG = LoggerFactory.getLogger(AllureAttachments.class);

    @Attachment(value = "{attachName}", type = "text/plain")
    private static String addMessage( String attachName, String text ) {
        return text;
    }

    public static void addBrowserConsoleLogs( ) {
        addMessage("Browser console logs", DriverUtils.getConsoleLogs());
    }

    @Attachment(value = "{attachName}", type = "image/png")
    public static byte[] attachScreenshot( String attachName ) {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "Page source", type = "text/html")
    public static byte[] attachPageSource( ) {
        return getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
    }

    public static void attachVideo(String sessionId) {
        URL videoUrl = getVideoUrl(sessionId);
        if (videoUrl != null) {
            InputStream videoInputStream = null;
            sleep(1000);

            for (int i = 0; i < 10; i++) {
                try {
                    videoInputStream = videoUrl.openStream();
                    break;
                } catch (FileNotFoundException e) {
                    sleep(1000);
                } catch (IOException e) {
                    LOG.warn("[ALLURE VIDEO ATTACHMENT ERROR] Cant attach allure video, {}", videoUrl);
                    e.printStackTrace();
                }
            }
            addAttachment("Video", "video/mp4", videoInputStream, "mp4");
        }
    }
    public static String getSessionId() {
        return ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
    }

    public static URL getVideoUrl( String sessionId ) {
        String videoUrl = DriverUtils.getVideoUrl() + sessionId + ".mp4";
        try {
            return new URL(videoUrl);
        } catch (MalformedURLException e) {
            LOG.warn("[ALLURE VIDEO ATTACHMENT ERROR] Wrong test video url, {}", videoUrl);
            e.printStackTrace();
        }
        return null;
    }

    public static void browserConsoleLogs( ) {
        addMessage(
                "Browser console logs",
                String.join("\n", Selenide.getWebDriverLogs(BROWSER))
        );

    }
}