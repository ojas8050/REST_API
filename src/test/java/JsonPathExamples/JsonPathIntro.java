package JsonPathExamples;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JsonPathIntro {
    @Test
    public void jsonPathDemo(){
        String json="{\n" +
                "    \"Company\": {\n" +
                "        \"Employee\": {\n" +
                "            \"FirstName\": \"Tanmay\",\n" +
                "            \"LastName\": \"Patil\",\n" +
                "            \"ContactNo\": \"1234567890\",\n" +
                "            \"Email\": \"tanmaypatil@xyz.com\"}}}";

        JsonPath jsonPath=new JsonPath(json);
        String lastname = jsonPath.get("Company.Employee.LastName");
        System.out.println(lastname);

    }
}
