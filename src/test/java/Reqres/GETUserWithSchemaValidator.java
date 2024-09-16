package Reqres;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

public class GETUserWithSchemaValidator {
    //to convert the response body to the json schema validator use site "jsonschema.net"
    @Test
    public void GetSingleUserSchemaValidator(){
        RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users/{id}")
                .pathParam("id",2)
                .get()
                .then()
                .statusCode(200)
                //Download the dependency called "maven Schema Validator"
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("SingleUserResponseSchema.json"))
                .log()
                .all();
    }
}
