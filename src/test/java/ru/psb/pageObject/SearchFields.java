package ru.psb.pageObject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchFields {
    SelenideElement TOP_BAR_FIELD = $(".header__controls"),
            CHAPTER_FIELD = $(".main-list-menu.main-flexible-menu"),
            CATEGORY_FIELD = $(".sublist-menu.sublist-flexible-menu");

    @Step("Enter in the field Origin: {text}")
    public void haveText(String text) {
        TOP_BAR_FIELD.shouldHave(text(text));
    }
    @Step("Enter1 in the field Origin: {text}")
    public void haveTextChapter(int index, String text) {
        CHAPTER_FIELD.find(".main-list-menu__item", index).shouldHave(text(text));
    }
    @Step("Enter1 in the field Origin: {text}")
    public void haveTextCategory(int index, String text) {
        CATEGORY_FIELD.find(".sublist-menu__link", index).shouldHave(text(text));
    }


}
