package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RequestNResponse2 {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;

    @BeforeClass
    public void ExpectedCondtions(){
        RequestSpecification requestSpecification= RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users/{id}")
                .pathParam("id",2)
                .contentType(ContentType.JSON);

        ResponseSpecification responseSpecification=RestAssured
                .expect()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .time(Matchers.lessThan(5000L));
    }

    @Test
    public void RequestNResponceGET(){
        RestAssured
                .given(requestSpecification,responseSpecification)
                .get()
                .then()
                .log()
                .all();
    }
}
