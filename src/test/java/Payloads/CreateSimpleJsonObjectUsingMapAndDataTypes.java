package Payloads;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class CreateSimpleJsonObjectUsingMapAndDataTypes {
    public static void main(String[] args) {
        Map<String,Object> jsonPayloadDatatypes=new HashMap<>(){{
            put( "FirstName", "Shreeman");
            put("LastName", "Legend");
            put("ContactNo",78909876789L);
            put("Email", "Legend@xyz.com");
            put("Married", false);
            put("Salary" , 23.27);
        }};

        RestAssured
                .given()
                .body(jsonPayloadDatatypes)
                .log()
                .all()
                .when()
                .get();


    }
}
