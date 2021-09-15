package ru.psb.regressTests.ui;

import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import ru.psb.annotations.JiraIssue;
import ru.psb.annotations.JiraIssues;
import ru.psb.annotations.Layer;
import ru.psb.annotations.Owner;
import ru.psb.helpers.CommonSteps;
import ru.psb.pageObject.SearchFields;
import org.junit.jupiter.api.Test;

@Layer("Web")
@Owner("shulbaeva")
public class TestsMainPage extends TestBase {
    SearchFields searchFields = new SearchFields();
    CommonSteps commonSteps = new CommonSteps();

    @Story("Positive test for Search Fields on TopBar")
    @JiraIssues({@JiraIssue("HOM-231")})
    @Tags({@Tag("web"), @Tag("regress"), @Tag("UI")})
    @DisplayName("Check the labels on the top panel on the site")
    @Test
    public void checkTopBar() {
        commonSteps.openPage();
        searchFields.haveText("Офисы");
        searchFields.haveText("Банкоматы");
        searchFields.haveText("Контакты");
        searchFields.haveTextChapter(0,"Частным лицам");
        searchFields.haveTextChapter(1,"Малому бизнесу");
        searchFields.haveTextChapter(2,"Среднему бизнесу");
        searchFields.haveTextChapter(3,"Корпорациям");
        searchFields.haveTextChapter(4,"Гособоронзаказ");
        searchFields.haveTextCategory(0,"Кредиты");
        searchFields.haveTextCategory(1,"Вклады и накопления");
        searchFields.haveTextCategory(2,"Ипотека");
        searchFields.haveTextCategory(3,"Карты");
        searchFields.haveTextCategory(4,"Премиальное обслуживание");
        searchFields.haveTextCategory(5,"Инвестиции");
        searchFields.haveTextCategory(6,"Военнослужащим");
        searchFields.haveTextCategory(7,"Счета и переводы");
    }

}