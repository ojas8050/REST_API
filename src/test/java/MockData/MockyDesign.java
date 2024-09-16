package MockData;

import io.restassured.RestAssured;

public class MockyDesign {
    public static void main(String[] args) {
        //Site to get the mock urls
        //https://designer.mocky.io/
        RestAssured
                .given()
                .log()
                .all()
                .get("https://run.mocky.io/v3/f21884ae-364f-4262-a5c1-7932060ca925")
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
