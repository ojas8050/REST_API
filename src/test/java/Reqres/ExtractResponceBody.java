package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ExtractResponceBody {
    public static void main(String[] args) {
        Object responceBody = RestAssured
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
                .statusCode(201)
                .extract()
                .body()
                .asPrettyString();
                //.statusCode();
        System.out.println(responceBody);
    }
}
