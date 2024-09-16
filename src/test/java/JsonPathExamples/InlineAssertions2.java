package JsonPathExamples;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;

public class InlineAssertions2 {
    public static void main(String[] args) {
            RestAssured
                    .given()
                        .baseUri("https://reqres.in/")
                        .basePath("api/users?page=2")
                    .when()
                        .get()
                    .then()
                        .statusCode(200)
                        .log()
                        .all()
                    .body("data.id", Matchers.hasItems(1,3,6));
    }
}
