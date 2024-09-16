package PojoExamples.NestedPojoEmaples;

import io.restassured.RestAssured;

import java.util.List;

public class ApiForStudentNestedJsonObject {
    public static void main(String[] args) {
        Address address=new Address(){{
            setHouseNo(96);
            setStreetname("mayanagari");
            setCity("Dholakpur");
            setState("BhomduNagari");
            setCountry("India");

        }};

        Student student=new Student(){{
            setId(23);
            setBalance(45.243);
            setAccountNo(76876564);
            setFirst_name("Kirmada");
            setLast_name("Khan");
            setEmail("Kirmada@chin_tapak_dam_dam.com");
            setGender("Male");
            setAddress((List<Address>) address);
        }};

        RestAssured
                .given()
                .log()
                .all()
                .body(student)
                .when()
                .get();
    }
}
