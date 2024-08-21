package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RequestNResponse {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    @BeforeClass
    public void ExpectedCondtions(){
        RequestSpecification requestSpecification= RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON);

        ResponseSpecification responseSpecification=RestAssured
                .expect()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .time(Matchers.lessThan(5000L));
    }

    @Test
    public void RequestToNewUser(){
        RestAssured
                .given(requestSpecification)
                //.spec(requestSpecification)
                .basePath("api/users")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .log()
                .all();
    }
}
