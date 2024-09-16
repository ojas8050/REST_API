package PojoExamples.ResponseToPojo;

import io.restassured.RestAssured;

public class JOResponseToPojo {
    public static void main(String[] args) {
        Employee response = RestAssured.get("https://run.mocky.io/v3/e2db7eb3-b614-4915-aa03-d08c26677884")
                .as(Employee.class);
        System.out.println(response.getEmail());
        System.out.println(response.getFirst_name());
    }
}
