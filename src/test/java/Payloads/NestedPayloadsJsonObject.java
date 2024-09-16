package Payloads;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class NestedPayloadsJsonObject {
    public static void main(String[] args) {
        Map<String,Object> jsonPayloadDatatypes=new HashMap<>(){{
            put( "FirstName", "Shreeman");
            put("LastName", "Legend");
            put("ContactNo",78909876789L);
            put("Email", "Legend@xyz.com");
            put("Married", false);
            put("Salary" , 23.27);
            Map<String,Object> AddressPayload=new HashMap<>(){{
               put("HouseNo", 4064);
               put("City", "Dholakpur");
               put("State", "Uganda");
            }};
            put("Address",AddressPayload);
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
