package Reqres;

import io.restassured.RestAssured;

public class GETListOfUsers {
    public static void main(String[] args) {
        RestAssured
                .given()
                    .baseUri("https://reqres.in/")
                    .basePath("/api/users?page=2")
                .when()
                    .get()
                .then()
                    .statusCode(200)
                    .log()
                    .all();
    }
}
