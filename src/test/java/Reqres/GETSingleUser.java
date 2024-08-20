package Reqres;

import io.restassured.RestAssured;

public class GETSingleUser {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users/{id}")
                .pathParam("id",2)
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
