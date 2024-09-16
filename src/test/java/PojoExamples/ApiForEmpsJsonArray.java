package PojoExamples;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

public class ApiForEmpsJsonArray {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setAccountNo(2345);
        e1.setBalance(123.45);
        e1.setId(12);
        e1.setFirst_name("Samiran");
        e1.setLast_name("Sharma");
        e1.setEmail("Samaira@chumma.com");
        e1.setGender("Male");

        Employee e2 = new Employee();
        e2.setAccountNo(8768);
        e2.setBalance(7687);
        e2.setId(21);
        e2.setFirst_name("Chumman");
        e2.setLast_name("Devata");
        e2.setEmail("Devata@chumma.com");
        e2.setGender("Male");

        List<Employee> ListofEmps=new ArrayList<>(){{
            add(e1);
            add(e2);
        }};

        RestAssured
                .given()
                .log()
                .all()
                .body(ListofEmps)
                .when()
                .get();
    }
}
