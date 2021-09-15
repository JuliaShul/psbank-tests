package ru.psb.regresstests.ui;

import ru.psb.helpers.AllureAttachments;
import ru.psb.helpers.DriverUtils;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static ru.psb.helpers.DriverUtils.configureDriver;


@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        configureDriver();
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = DriverUtils.getSessionId();
        AllureAttachments.attachScreenshot("Last screenshot");
        AllureAttachments.attachPageSource();
        AllureAttachments.addBrowserConsoleLogs();
        closeWebDriver();
        if (DriverUtils.isVideoOn()) {
            AllureAttachments.attachVideo(sessionId);
        }

    }
}
