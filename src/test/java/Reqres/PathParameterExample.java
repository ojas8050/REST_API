package Reqres;

import io.restassured.RestAssured;

public class PathParameterExample {
    public static void main(String[] args) {
        RestAssured
                .given()
                .log()
                .all()
//                .baseUri("https://reqres.in/")
//                .basePath("api/users/{id}")
//                .pathParam("id",22)
                .when()
                .get("https://reqres.in/api/users/{id}",22)
                .then()
                .statusCode(404)
                .log()
                .all();

    }
}
