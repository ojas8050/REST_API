package PojoExamples.ResponseToPojo;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import java.util.List;

public class JAResponseToPojo2 {
    public static void main(String[] args) {
        List<Address> address = RestAssured.get("https://run.mocky.io/v3/78cf1e34-8948-4362-bb3e-0700c4034d28")
                .as(new TypeRef<>(){});

        System.out.println("Number of address : "+ address.size());
        System.out.println(address.get(0).getCountry());
        System.out.println(address.get(1).getHouseNo());
        System.out.println(address.get(0).getStreetname());
        System.out.println(address.get(1).getCity());

    }
}
