package ru.awg.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.SelenideElement.*;


public class TestsMainPage  {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка надписей на сайте")
    void generatedTest() {
        step("Open url 'https://www.psbank.ru/'", () ->
                open("https://www.psbank.ru/"));

        step("Проверка что есть надпись \"Лучшие предложения для частных лиц\"", () -> {
            $("h1.main-title").shouldHave(text("Лучшие предложения для частных лиц"));
        });

        step("Page title should have header text '«ПСБ» - универсальный банк в РФ. Открытие счетов, вклады, депозиты, карты, ипотека, кредиты для бизнеса и населения, РКО в вашем городе.'", () -> {
            String expectedTitle = "«ПСБ» - универсальный банк в РФ. Открытие счетов, вклады, депозиты, карты, ипотека, кредиты для бизнеса и населения, РКО в вашем городе.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });

        step("Проверка что вкладка \"Частным лицам\" кликабельна", () -> {
            $$("li.main-list-menu__item").first().click();

            $("title").shouldNot(Condition.visible, Duration.ofSeconds(3));
            String expectedTitle = "Банковские услуги для физических лиц";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });


    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.psbank.ru/'", () ->
            open("https://www.psbank.ru/"));


    }

//    @Test
//    @Description("Autogenerated test")
//    @DisplayName("Page console log should not have errors")
//    void consoleShouldNotHaveErrorsTest() {
//        step("Open url 'https://www.awg.ru/'", () ->
//            open("https://www.awg.ru/"));
//
//        step("Console logs should not contain text 'SEVERE'", () -> {
//            String consoleLogs = DriverUtils.getConsoleLogs();
//            String errorText = "SEVERE";
//
//            assertThat(consoleLogs).doesNotContain(errorText);
//        });
//    }
}