package PojoExamples.ResponseToPojo;

import io.restassured.RestAssured;

public class PartOfNestedJOResponseToPojo {
    public static void main(String[] args) {
        Address response = RestAssured.get("https://run.mocky.io/v3/3cc417f5-b8c7-4ac3-ae5a-3c8e6ab6f0f6")
                .then()
                .extract()
                .jsonPath()
                .getObject("address",Address.class);

        System.out.println(response.getCountry());
        response.setCountry("Bangla");
        System.out.println(response.getCountry());



    }
}
