package MockData;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObjectResponseToList {
    public static void main(String[] args) {
        List response = RestAssured
                .given()
                .get("https://run.mocky.io/v3/aa061540-262f-44e6-9c38-ef70ef9be9ef")
                .as(List.class);

        System.out.println(response.size());
        System.out.println(response.get(0));

        Map<String,Object> emp1= (Map<String, Object>) response.get(0);
        System.out.println(emp1.get("first_name"));
    }
}
