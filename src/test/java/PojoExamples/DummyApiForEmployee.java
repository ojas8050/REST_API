package PojoExamples;

import io.restassured.RestAssured;

public class DummyApiForEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setAccountNo(2345);
        e1.setBalance(123.45);
        e1.setId(12);
        e1.setFirst_name("Samiran");
        e1.setLast_name("Sharma");
        e1.setEmail("Samaira@chumma.com");
        e1.setGender("Male");

        RestAssured
                .given()
                .log()
                .all()
                .body(e1)
                .when()
                .get();
    }
}
