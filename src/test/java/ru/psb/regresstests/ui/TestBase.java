package ru.psb.regresstests.ui;

import ru.psb.config.Project;
import ru.psb.helpers.AllureAttachments;
import ru.psb.helpers.DriverUtils;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import static ru.psb.helpers.DriverUtils.configureDriver;


@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
    static void setUp() {
        configureDriver();
    }

    @AfterEach
    public void addAttachments() {
        AllureAttachments.attachScreenshot("Last screenshot");
        AllureAttachments.attachPageSource();
        AllureAttachments.addBrowserConsoleLogs();
        if (System.getProperty("video.storage") != null)
            AllureAttachments.attachVideo();
        Selenide.closeWebDriver();
    }
}
