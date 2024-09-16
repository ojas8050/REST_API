package JsonPathExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;

public class InlineAssertions {
    public static void main(String[] args) {
        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com/auth")
                    .log()
                    .all()
                    .body("{\n" +
                            "    \"username\" : \"admin\",\n" +
                            "    \"password\" : \"password123\"\n" +
                            "}")
                    .contentType(ContentType.JSON)
                .when()
                    .post()
                .then()
                    .log()
                    .all()
                    //assertions
                    .body("token", Matchers.notNullValue())
                    .body("token.length()",Matchers.is(15))
                    .body("token.length()",Matchers.equalTo(15));
    }
}
