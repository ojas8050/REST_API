package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUserMC {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .basePath("api/users")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .post()
                .then()
                .log()
                .all()
                .statusCode(201);

        //responce.then().statusCode(201).log().all();
    }
}
