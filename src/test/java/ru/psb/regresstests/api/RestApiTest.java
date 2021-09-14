package ru.psb.regresstests.api;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import ru.psb.Specs;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;

//@Layer("rest")
//@Owner("Izibekova")
//@DisplayName("Проверка информации о персонажах")
public class RestApiTest {


//    @Test
////    @JiraIssues({@JiraIssue("RK-01")})
//    @Tags({@Tag("api"), @Tag("regress")})
//    @DisplayName("Проверить токен")
//    void addProductInCartTest( ) {
//        step("Открыть главную страницу", ( ) -> {
//            //Открыть главную страницу
//            open("https://reqres.in/");
//        });
//        step("Проверить актуальное количество товара в корзине", ( ) -> {
//            //Проверить актуальное количество товара в корзине
//            $(byText("Register - successful")).click();
//            $(".response").shouldHave(text("QpwL5tke4Pnpja7X4"));
//        });
//    }
//
//    ;
//
//    @Test
////    @JiraIssues({@JiraIssue("RK-01")})
//    @Tags({@Tag("api"), @Tag("regress")})
//    @DisplayName("Поиск юзера по номеру")
//    void checkFirstName( ) {
//        Specs.request
//                .when()
//                .get("/users/2")
//                .then()
//                .body("data.first_name", is("Janet"));
//    }
}
//
//    @Test
////    @JiraIssues({@JiraIssue("RK-01")})
//    @Tags({@Tag("api"), @Tag("regress")})
//    @DisplayName("Поиск юзера")
//    void checkPostName() {
//        String response =Specs.request
//                .body("{\"name\": \"morpheus\","+
//                        "\"job\": \"leader\"}")
//                .when()
//                .post("https://reqres.in/api/users")
//                .then()
//                .statusCode(201)
//                .extract().path("name");
//        assertEquals(response);
//    }
//
//
//
//    @Test
////    @JiraIssues({@JiraIssue("RK-01")})
//    @Tags({@Tag("api"), @Tag("regress")})
//    @DisplayName("Удаление юзера из списка")
//    void checkDeleteUser() {
//        String response = Specs.request
//                .body("{\"name\": \"morpheus\"," + "\"job\": \"leader\"}")
//                .when()
//                .post("https://reqres.in/api/users/2")
//                .then()
//                .statusCode(201)
//                .extract().path("id");
//
//        delete("https://reqres.in/api/users/" + response)
//                .then()
//                .statusCode(204);
//    }
//
//    @Test
////    @JiraIssues({@JiraIssue("RK-01")})
//    @Tags({@Tag("api"), @Tag("regress")})
//    @DisplayName("Неуспешная регистрация юзера")
//    void registerUnsuccessful() {
//        Specs.request
//                .body("{\"email\": \"123@mail.ru\"}")
//                .when().post("https://reqres.in/api/register")
//                .then().statusCode(400)
//                .body("error", is("Missing password"));
//    }
//    @Test
////    @JiraIssues({@JiraIssue("RK-01")})
//    @Tags({@Tag("api"), @Tag("regress")})
//    @DisplayName("Регистрация юзера")
//    void checkToken() {
//        String response = Specs.request
//                .body("{\"email\": \"123m@reqres.in\"," +
//                        "\"password\": \"temp\"}")
//                .when()
//                .post("https://reqres.in/api/register")
//                .then()
//                .statusCode(400)
//                .extract().path("token");
//        StringUtils.isNoneEmpty(response);
//    }
//

