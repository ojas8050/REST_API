package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RAScriptInBDDFormat {
    public static void main(String[] args) {
        //Given - Build Request
        RestAssured
                .given()
                    .baseUri("https://reqres.in/")
                    .basePath("api/users")
                    .body("{\n" +
                            "    \"name\": \"morpheus\",\n" +
                            "    \"job\": \"leader\"\n" +
                            "}")
                    .contentType(ContentType.JSON)
                .when() //Hit the request
                    .post()
                .then() //Validate the response
                    .statusCode(201)
                    .log()
                    .all();

    }
}
