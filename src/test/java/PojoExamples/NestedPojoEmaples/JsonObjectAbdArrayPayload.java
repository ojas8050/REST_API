package PojoExamples.NestedPojoEmaples;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

public class JsonObjectAbdArrayPayload {
    public static void main(String[] args) {

        Address address=new Address(){{
            setHouseNo(96);
            setStreetname("mayanagari");
            setCity("Dholakpur");
            setState("BhomduNagari");
            setCountry("India");

        }};

        Address address2=new Address(){{
            setHouseNo(69);
            setStreetname("I dont know");
            setCity("Gatar");
            setState("channai");
            setCountry("India");

        }};

        List<Address> allAddress=new ArrayList<>(){{
            add(address);
            add(address2);
        }};

            Student student=new Student(){{
                setId(23);
                setBalance(45.243);
                setAccountNo(76876564);
                setFirst_name("Kirmada");
                setLast_name("Khan");
                setEmail("Kirmada@chin_tapak_dam_dam.com");
                setGender("Male");
                setAddress(allAddress);
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
