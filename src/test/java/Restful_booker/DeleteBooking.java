package Restful_booker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteBooking {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking/2")
                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .contentType(ContentType.JSON)
                .when()
                .delete()
                .then()
                .assertThat()
                .statusCode(201) //Created
                .log().all();
    }
}
