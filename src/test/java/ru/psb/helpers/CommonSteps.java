package ru.psb.helpers;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class CommonSteps {
    @Step("Open page {url}")
    public void openPage() {
        open("https://www.psbank.ru/");
    }
}
