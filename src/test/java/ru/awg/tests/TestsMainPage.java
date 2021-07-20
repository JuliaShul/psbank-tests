package ru.awg.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.awg.helpers.DriverSettings;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static com.codeborne.selenide.Selenide.$;


public class TestsMainPage extends DriverSettings {
    @BeforeAll
    static void setStartConfig() {
        Configuration.startMaximized = true;

    }

    @Test
    @DisplayName("Проверка открытия сайта")
    public void openMainPage() {
        step("Open url 'https://www.psbank.ru/'", () ->
                open("https://www.psbank.ru/"));
    }
    @Test
    @DisplayName("Проверка заголовка сайта")
    public void checkTitle() {
        step("Page title should have header text '«ПСБ» - универсальный банк в РФ. Открытие счетов, вклады, депозиты, карты, ипотека, кредиты для бизнеса и населения, РКО в вашем городе.'", () -> {
            String expectedTitle = "«ПСБ» - универсальный банк в РФ. Открытие счетов, вклады, депозиты, карты, ипотека, кредиты для бизнеса и населения, РКО в вашем городе.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
    @Test
    @DisplayName("Проверить автоматически выбранный регион")
    public void checkRegion() {
        step("Check auto-selected region", () -> {
            $(".header-cityname").click();
            $(".isActive-city").shouldHave(text("Новосибирск"));
        });

        step("Close auto-selected region", () -> {
            $(".main-aside__close").click();
        });
    }
    @Test
    @Description("")
    @DisplayName("Проверка надписей на верхней панеле на сайте")
    public void checkTopBar() {
        //дописать обращение к массиву
        step("Проверить наличие раздела 'Офисы и Банкоматы'", ( ) -> {
            $(".header__controls").shouldHave(text("Офисы"));
            $(".header__controls").shouldHave(text("Банкоматы"));
        });

        step("Проверить наличие раздела 'Контакты'", ( ) -> {
            $(".header__controls").shouldHave(text("Контакты"));
        });

//        step("Проверить наличие раздела 'Интернет-банк'", ( ) -> {
//            $(".header__container").find(".ib-nav__title", 1).shouldHave(text("Интернет-банк"));
//        });

        step("Проверить наличие раздела 'Частным лицам'", ( ) -> {
            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item", 0).shouldHave(text("Частным лицам"));
        });

        step("Проверить наличие раздела 'Малому бизнесу'", ( ) -> {
            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item", 1).shouldHave(text("Малому бизнесу"));
        });

        step("Проверить наличие раздела 'Среднему бизнесу'", ( ) -> {
            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item", 2).shouldHave(text("Среднему бизнесу"));
        });

        step("Проверить наличие раздела 'Корпорациям'", ( ) -> {
            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item", 3).shouldHave(text("Корпорациям"));
        });

        step("Проверить наличие раздела 'Гособоронзаказ'", ( ) -> {
            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item", 4).shouldHave(text("Гособоронзаказ"));
        });

        step("Проверить наличие раздела 'Банкам'", ( ) -> {
            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item", 5).shouldHave(text("Банкам"));
        });
//
//        step("Проверить наличие раздела 'Private banking'", ( ) -> {
//            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item.inVisible", 6).shouldHave(text("Private banking"));
//        });
//
//        step("Проверить наличие раздела 'Аналитика'", ( ) -> {
//            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item.inVisible", 7).shouldHave(text("Аналитика"));
//        });
//
//        step("Проверить наличие раздела 'О банке'", ( ) -> {
//            $(".main-list-menu.main-flexible-menu").find(".main-list-menu__item.inVisible", 8).shouldHave(text("О банке"));
//        });
    }
    @Test
    @DisplayName("Проверка категорий на верхней панеле на сайте")
    public void checkTopBarCategories() {
        step("Проверить наличие раздела 'Кредиты'", ( ) -> {
            $(".sublist-menu.sublist-flexible-menu").find(".sublist-menu__link", 0).shouldHave(text("Кредиты"));
        });

        step("Проверить наличие раздела 'Вклады и накопления'", ( ) -> {
            $(".sublist-menu.sublist-flexible-menu").find(".sublist-menu__link", 1).shouldHave(text("Вклады и накопления"));
        });

        step("Проверить наличие раздела 'Ипотека'", ( ) -> {
            $(".sublist-menu.sublist-flexible-menu").find(".sublist-menu__link", 2).shouldHave(text("Ипотека"));
        });

        step("Проверить наличие раздела 'Карты'", ( ) -> {
            $(".sublist-menu.sublist-flexible-menu").find(".sublist-menu__link", 3).shouldHave(text("Карты"));
        });

        step("Проверить наличие раздела 'Премиальное обслуживание'", ( ) -> {
            $(".sublist-menu.sublist-flexible-menu").find(".sublist-menu__link", 4).shouldHave(text("Премиальное обслуживание"));
        });

        step("Проверить наличие раздела 'Инвестиции'", ( ) -> {
            $(".sublist-menu.sublist-flexible-menu").find(".sublist-menu__link", 5).shouldHave(text("Инвестиции"));
        });

        step("Проверить наличие раздела 'Военнослужащим'", ( ) -> {
            $(".sublist-menu.sublist-flexible-menu").find(".sublist-menu__link", 6).shouldHave(text("Военнослужащим"));
        });

        step("Проверить наличие раздела 'Счета и переводы'", ( ) -> {
            $(".sublist-menu.sublist-flexible-menu").find(".sublist-menu__link", 7).shouldHave(text("Счета и переводы"));
        });
    }
//    @Test
//    @DisplayName("Проверка категорий на верхней панеле на сайте")
//    public void checkFirstBlock() {
//        step("Проверка, что блок 'Паевые Инвестиционные фонды' кликабелен", () -> {
//            $$("div.product-card__side").first().hover();
//            $("a.btn-main.btn-main--small.btn-main--blue.product-card__btn").click();
//            $(".text-p.text-section__main-title").shouldHave(text("ПИФ или Паевой инвестиционный фонд"));
//        });
//    }


}