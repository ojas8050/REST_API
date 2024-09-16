package JsonPathExamples;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JsonArray {
    @Test
    public void JsonPathArray(){
        String JsonArray = "[\n" +
                "  [\n" +
                "    \"10\",\n" +
                "    \"20\",\n" +
                "    \"30\",\n" +
                "    \"40\",\n" +
                "    \"50\"\n" +
                "  ],\n" +
                "  [\n" +
                "    \"100\",\n" +
                "    \"200\",\n" +
                "    \"300\",\n" +
                "    \"400\",\n" +
                "    \"500\"\n" +
                "  ]\n" +
                "]";
        JsonPath jsonPath=new JsonPath(JsonArray);
        System.out.println(jsonPath.getString("[0][3]"));//40
        System.out.println(jsonPath.getString("[1][2]"));//300
    }
}
