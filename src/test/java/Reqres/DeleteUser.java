package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteUser {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users/{id}")
                .pathParam("id",2)
                .contentType(ContentType.JSON)
                .when()
                .delete()
                .then()
                .assertThat()
                .statusCode(204) //No Content
                .log()
                .all();
    }
}
