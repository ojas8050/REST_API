package Payloads;

import io.restassured.RestAssured;

import java.util.*;

public class ComplexPayloadUsingMapList {
    public static void main(String[] args) {
        //Parent JSON array
        List<Map<String,Object>> finalObject=new ArrayList<>();

        Map<String,Object> firstJsonObject=new LinkedHashMap<>();
        firstJsonObject.put("id",1);
        firstJsonObject.put("first_name","Shreeman");
        firstJsonObject.put("last_name","Legend");
        firstJsonObject.put("email","graye0@yale.edu");
        firstJsonObject.put("gender","Male");

        //ArrayList
        List<String> mobileno=new ArrayList<>();
        mobileno.add("9876765453");
        mobileno.add("6789876521");

        firstJsonObject.put("mobile",mobileno);

        Map<String,Object> skillstag=new HashMap<>();
        skillstag.put("name","Testing");
        skillstag.put("proficiency","Medium");

        firstJsonObject.put("skills",skillstag);
        finalObject.add(firstJsonObject);

        //Second Object
        Map<String,Object> secondJsonObject =new LinkedHashMap<>();
        secondJsonObject.put("id",2);
        secondJsonObject.put("first_name","Suraj");
        secondJsonObject.put("last_name","Sudhakar");
        secondJsonObject.put("email","ssudhakar@gmail.com");
        secondJsonObject.put("gender","Gay");

        List<String> mobileno2=new ArrayList<>();
        mobileno2.add("9164362535");
        mobileno2.add("6360408495");

        secondJsonObject.put("mobile",mobileno2);

        Map<String,Object> skillstag2=new HashMap<>();
        skillstag2.put("name","Taali Bajana");
        skillstag2.put("proficiency","Expert");

        secondJsonObject.put("skills",skillstag2);
        finalObject.add(secondJsonObject);

        RestAssured
                .given()
                .body(finalObject)
                .log()
                .all()
                .when()
                .get();
    }
}
/*
[
  {
    "id": 1,
    "first_name": "Shreeman",
    "last_name": "Legend",
    "email": "graye0@yale.edu",
    "gender": "Male",
    "mobile": [
      "9876765453",
      "6789876521"
    ],
    "skills": {
      "name": "Testing",
      "proficiency": "Medium"
    }
  },
  {
    "id": 2,
    "first_name": "Suraj",
    "last_name": "Sudhakar",
    "email": "ssudhakar@gmail.com",
    "gender": "Gay",
    "mobile": [
      "9164362535",
      "6360408495"
    ],
    "skills": {
      "name": "Taali Bajana",
      "proficiency": "Expert"
    }
  }
]
*/
