package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecifications {

    @Test
    public void CreateUser(){
        //Response Specification
        //Validation
        ResponseSpecification responceSpecification = RestAssured
                .expect()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .time(Matchers.lessThan(5000L));

        RestAssured
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
                .log()
                .all()
                .spec(responceSpecification);

    }
}
