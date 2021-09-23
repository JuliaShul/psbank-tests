package ru.psb.regressTests.api;

import io.qameta.allure.Story;
import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import ru.psb.annotations.JiraIssue;
import ru.psb.annotations.JiraIssues;
import ru.psb.annotations.Layer;
import ru.psb.annotations.Owner;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;

@Layer("Api")
@Owner("shulbaeva")
public class RegressInTests {
    @BeforeAll
    static void setup() { RestAssured.baseURI = "https://reqres.in";}

    @Test
    @Story("Get requests")
    @JiraIssues({@JiraIssue("HOM-235")})
    @Tag("api")
    @DisplayName("Get a single resource")
    void singleResourceSuccessfulTest() {
        given()
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200)
                .body("data.id", is(2))
                .body("data.name", is("fuchsia rose"));
    }


    @Test
    @Story("Get requests")
    @JiraIssues({@JiraIssue("HOM-235")})
    @Tag("api")
    @DisplayName("Get a single resource, negative test")
    void singleResourceFailedTest() {
        given()
                .when()
                .get("/api/unknown/23")
                .then()
                .statusCode(404);
    }


    @Test
    @Story("Post requests")
    @JiraIssues({@JiraIssue("HOM-235")})
    @Tag("api")
    @DisplayName("Successful registration test")
    void registrationSuccessfulTest() {
        given()
                .contentType(JSON)
                .body("{ \"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\" }")
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .body("id", is(4))
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }


    @Test
    @Story("Post requests")
    @JiraIssues({@JiraIssue("HOM-235")})
    @Tag("api")
    @DisplayName("Successful login test")
    void loginSuccessfulTest() {
        given()
                .contentType(JSON)
                .body("{ \"email\": \"eve.holt@reqres.in\", \"password\": \"cityslicka\" }")
                .when()
                .post("/api/login")
                .then()
                .statusCode(200)
                .body("token", is("QpwL5tke4Pnpja7X4"));
    }


    @Test
    @Story("Put requests")
    @JiraIssues({@JiraIssue("HOM-235")})
    @Tag("api")
    @DisplayName("Successful update of user data")
    void updateUserSuccessfulTest() {
        given()
                .contentType(JSON)
                .body("{ \"name\": \"morpheus\", \"job\": \"zion resident\" }")
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .body("name", is("morpheus"))
                .body("job", is("zion resident"));
    }
}