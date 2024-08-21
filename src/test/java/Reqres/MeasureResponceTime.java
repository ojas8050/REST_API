package Reqres;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MeasureResponceTime {
    @Test
    public void ResponceTime(){
        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in/")
                .basePath("api/users")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .post();
        long ResponseInMS = response.time();
        System.out.println("Response in MS: "+ResponseInMS);

        long responseInSec = response.timeIn(TimeUnit.SECONDS);
        System.out.println("Response Time in the Seconds: "+responseInSec);

        long ResponseInMS1 = response.getTime();
        System.out.println("Response in MS: "+ResponseInMS1);

        long responseInSec1 = response.getTimeIn(TimeUnit.SECONDS);
        System.out.println("Response Time in the Seconds: "+responseInSec1);

        response.then().time(Matchers.both(Matchers.lessThan(5000L)).and(Matchers.greaterThan(1000L)));
    }
}
