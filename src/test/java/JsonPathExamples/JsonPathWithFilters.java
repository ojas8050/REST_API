package JsonPathExamples;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.File;
import java.io.InputStream;

public class JsonPathWithFilters {
    @Test
    public void PathWithFilters(){
       File JsonFile=new File("src/test/resources/Emp.json");
        JsonPath jsonPath=new JsonPath(JsonFile);
        System.out.println(jsonPath.getString("[1].FirstName"));
        System.out.println(jsonPath.getList("FirstName"));
        System.out.println(jsonPath.getList("findAll{it.Gender == 'Female'}.FirstName"));
        System.out.println(jsonPath.getString("find{it.FirstName == 'Pavan' & it.LastName == 'Kumar'}.Email"));
        System.out.println(jsonPath.getString("findAll{it.FirstName == 'Pavan' | it.LastName == 'Kumari'}.Email"));
    }
}
