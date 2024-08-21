package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateMultipleUser {
    RequestSpecification requestSpecification;
    @BeforeClass
    public void SetupRequestSpec(){
        requestSpecification=RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON);
    }

    @Test
    public void CreateUser(){
        RestAssured
                .given()
                .spec(requestSpecification)
                .basePath("api/users")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .post()
                .then()
                .log()
                .all()
                .statusCode(201);
    }

    @Test
    public void UpdateUser(){
        RestAssured
                .given()
                .spec(requestSpecification)
                .basePath("/api/users/{id}")
                .pathParam("id",2)
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .when()
                .put()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
