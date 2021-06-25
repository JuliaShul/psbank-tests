package ru.awg.tests;

import ru.awg.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Проверка надписи на сайте")
    void generatedTest() {
        step("Open url 'https://www.awg.ru/'", () ->
                open("https://www.awg.ru/"));

        step("Проверка что есть надпись \"Увеличим продажи и конверсию с помощью ускорения сайта\"", () -> {
            $(".main-slider").shouldHave(text("Увеличим продажи и конверсию с помощью ускорения сайта"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.awg.ru/'", () ->
            open("https://www.awg.ru/"));

        step("Page title should have text 'AWG - ведущий ИТ-интегратор для выхода бизнеса на новый уровень'", () -> {
            String expectedTitle = "AWG - ведущий ИТ-интегратор для выхода бизнеса на новый уровень";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.awg.ru/'", () ->
            open("https://www.awg.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}