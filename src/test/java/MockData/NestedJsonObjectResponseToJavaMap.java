package MockData;

import io.restassured.RestAssured;

import java.util.Map;

public class NestedJsonObjectResponseToJavaMap {
    public static void main(String[] args) {
        Map response = RestAssured
                .get("https://run.mocky.io/v3/786ca044-42ed-4fe6-b593-817020537d2c")
                .as(Map.class);
        System.out.println(response.get("first_name"));
        Map skillsmap=(Map)response.get("skills");
        System.out.println(skillsmap.get("name"));
        System.out.println(skillsmap.get("proficiency"));

    }
}
