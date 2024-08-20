package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateJobPATCH {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users/{id}")
                .pathParam("id",2)
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .put()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
