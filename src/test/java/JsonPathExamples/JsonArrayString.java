package JsonPathExamples;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JsonArrayString {
    @Test
    public void JsonArrayStringExample(){
        String JsonArray="[\n" +
                "    {\n" +
                "    \"Employee\": {\n" +
                "            \"FirstName\": \"Tanmay\",\n" +
                "            \"LastName\": \"Patil\",\n" +
                "            \"ContactNo\": \"1234567890\",\n" +
                "            \"Email\": \"tanmaypatil@xyz.com\",\n" +
                "            \"Address\": [\n" +
                "                {\n" +
                "                \"City\": \"Bangalore\",\n" +
                "                \"State\": \"Karnataka\",\n" +
                "                \"Zip\": \"560212\"\n" +
                "                },\n" +
                "                {\n" +
                "                \"City\": \"Patna\",\n" +
                "                \"State\": \"Jharkhand\",\n" +
                "                \"Zip\": \"591239\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    },\n" +
                "    {\n" +
                "         \"Employee\": {\n" +
                "            \"FirstName\": \"Nikhil\",\n" +
                "            \"LastName\": \"Kaggude\",\n" +
                "            \"ContactNo\": \"90876654321\",\n" +
                "            \"Email\": \"nk@xyz.com\",\n" +
                "            \"Address\": [\n" +
                "                {\n" +
                "                \"City\": \"Bangalore\",\n" +
                "                \"State\": \"Karnataka\",\n" +
                "                \"Zip\": \"560213\"\n" +
                "                },\n" +
                "                {\n" +
                "                \"City\": \"Nippani\",\n" +
                "                \"State\": \"Karnataka\",\n" +
                "                \"Zip\": \"591237\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "]";
        JsonPath jsonPath=new JsonPath(JsonArray);
        System.out.println(jsonPath.getString("[0].Employee.FirstName"));//Tanmay
        System.out.println(jsonPath.getString("[1].Employee.FirstName"));//Nikhil
        System.out.println(jsonPath.getString("[1].Employee.Address[0].Zip"));//560213
        System.out.println(jsonPath.getString("[1].Employee.Address[1].City"));//Nippani
        System.out.println(jsonPath.getList("[1].Employee.Address.City"));
        System.out.println(jsonPath.getList("Employee.FirstName"));
    }
}
