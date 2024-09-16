package PojoExamples.ResponseToPojo;

import io.restassured.RestAssured;

import java.util.Arrays;

public class JAResponseToPojo {
    public static void main(String[] args) {
        Address[] address = RestAssured.get("https://run.mocky.io/v3/78cf1e34-8948-4362-bb3e-0700c4034d28")
                .as(Address[].class);

        System.out.println("Number of address : "+ address.length);
        System.out.println(address[0].getCity());
        System.out.println(address[1].getHouseNo());
        System.out.println(address[0].getStreetname());
        System.out.println(address[1].getCity());
    }
}
