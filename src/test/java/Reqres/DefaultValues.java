package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DefaultValues {
    @BeforeClass
    public void setup(){
        RestAssured.baseURI="https://reqres.in";
        RestAssured.basePath="/api/users/2";
        RestAssured.requestSpecification=RestAssured.given().log().all();
        RestAssured.responseSpecification=RestAssured.expect().time(Matchers.lessThan(5000L));
    }

    @Test
    public void DeleteUser1(){
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .delete()
                .then()
                .extract()
                .body()
                .asPrettyString();
    }

    @Test
    public void DeleteUser2(){
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .delete()
                .then()
                .extract()
                .body()
                .asPrettyString();
    }

}
