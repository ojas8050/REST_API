package Restful_booker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PartialUpdatePATCH {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/1")
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .body("{\n" +
                        "    \"firstname\" : \"Chandini\",\n" +
                        "    \"lastname\" : \"Mehera\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .patch()
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();
    }
}
