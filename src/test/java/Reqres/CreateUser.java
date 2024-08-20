package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {
    public static void main(String[] args) {
        //Build Request
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://reqres.in/");
        request.basePath("api/users");
        request.body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");
        request.contentType(ContentType.JSON);

        //Hit request and Get responce
        Response response = request.post();

        //Validate Response
        response.then().statusCode(201).log().all();
    }
}
