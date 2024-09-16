package MockData;

import io.restassured.RestAssured;

import java.util.Map;

public class JsonObjectResponceToJavaMap {
    public static void main(String[] args) {
        Map response = RestAssured
                .get("https://run.mocky.io/v3/76283a5f-bb59-4b6f-80aa-5fe823ef3747")
                .as(Map.class);
        System.out.println(response.get("first_name"));
        System.out.println(response.keySet());
    }
}
