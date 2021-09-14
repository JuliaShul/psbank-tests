package ru.psb.helpers;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ru.psb.config.ProjectConfig;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.getWebDriverLogs;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static java.lang.String.join;
import static org.openqa.selenium.logging.LogType.BROWSER;

public class DriverUtils {

    private static ProjectConfig getDriverConfig() {
        return ConfigFactory.newInstance().create(ProjectConfig.class, System.getProperties());
    }
//
//    public static String getWebMobile() {
//        return getDriverConfig().webBrowserMobileView();
//    }
//
//    public static boolean isWebMobile() {
//        return !getWebMobile().equals("");
//    }


    public static String getWebRemoteDriver() {
        return String.format(getDriverConfig().remoteDriverUrl(),
                getDriverConfig().webRemoteDriverUser(),
                getDriverConfig().webRemoteDriverPassword());
    }

    public static boolean isRemoteWebDriver() {
        return !getDriverConfig().remoteDriverUrl().equals("");
    }

    public static String getVideoUrl() {
        return getDriverConfig().videoStorage();
    }

    public static boolean isVideoOn() {
        return !getVideoUrl().equals("");
    }

    public static String getSessionId() {
        return ((RemoteWebDriver) getWebDriver()).getSessionId().toString().replace("selenoid", "");
    }

    public static String getConsoleLogs() {
        return join("\n", getWebDriverLogs(BROWSER));
    }

    public static void configureDriver() {
        addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = getDriverConfig().browser();
        Configuration.browserVersion = getDriverConfig().browserVersion();
        Configuration.browserSize = getDriverConfig().browserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();

//        if (isWebMobile()) { // for chrome only
//            ChromeOptions chromeOptions = new ChromeOptions();
//            Map<String, Object> mobileDevice = new HashMap<>();
//            mobileDevice.put("deviceName", getWebMobile());
//            chromeOptions.setExperimentalOption("mobileEmulation", mobileDevice);
//            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//        }

        if (isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = getWebRemoteDriver();
        }

        Configuration.browserCapabilities = capabilities;
    }
}
