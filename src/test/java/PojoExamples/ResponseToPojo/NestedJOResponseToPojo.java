package PojoExamples.ResponseToPojo;

import io.restassured.RestAssured;

public class NestedJOResponseToPojo {
    public static void main(String[] args) {
        EmployeeWithAddress response = RestAssured.get("https://run.mocky.io/v3/3cc417f5-b8c7-4ac3-ae5a-3c8e6ab6f0f6")
                .as(EmployeeWithAddress.class);

        System.out.println(response.getAddress().getCountry());
        System.out.println(response.getAddress().getStreetname());
        System.out.println(response.getBalance());


    }
}
