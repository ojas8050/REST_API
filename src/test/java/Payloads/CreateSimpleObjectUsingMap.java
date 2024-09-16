package Payloads;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class CreateSimpleObjectUsingMap {
    public static void main(String[] args) {
        Map<String,String> jsonObjectPlayload=new HashMap<>(){{
            put( "FirstName", "Shreeman");
            put("LastName", "Legend");
            put("ContactNo","78909876789");
            put("Email", "Legend@xyz.com");
        }};

        RestAssured
                .given()
                .body(jsonObjectPlayload)
                .log()
                .all()
                .when()
                .get();

    }
}
