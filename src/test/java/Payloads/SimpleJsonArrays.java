package Payloads;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleJsonArrays {
    public static void main(String[] args) {
        Map<String,Object> jsonObjectPlayload=new HashMap<>(){{
            put("id", 1);
            put( "first_name", "Shreeman");
            put("last_name", "Legend");
            put("email", "graye0@yale.edu");
            put("gender","Male");
        }};

        Map<String,Object> jsonObjectPlayload2=new HashMap<>(){{
            put("id", 2);
            put( "first_name", "Herold");
            put("last_name", "Brennon");
            put("email", "hbrennon1@nature.com");
            put("gender","Male");
        }};

        List<Map<String,Object>> AllEmps=new ArrayList<>(){{
            add(jsonObjectPlayload);
            add(jsonObjectPlayload2);
        }};

        RestAssured
                .given()
                .log()
                .all()
                .body(AllEmps)
                .when()
                .get();
    }
}
