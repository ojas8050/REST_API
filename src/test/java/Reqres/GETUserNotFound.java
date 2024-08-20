package Reqres;

import io.restassured.RestAssured;

public class GETUserNotFound {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .basePath("api/users/{id}")
                .pathParam("id",22)
                .when()
                .get()
                .then()
                .statusCode(404)
                .log()
                .all();

    }
}
