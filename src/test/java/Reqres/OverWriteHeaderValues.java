package Reqres;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;
import org.testng.annotations.Test;

public class OverWriteHeaderValues {
    //Here the Values of Header1 and Header2 is OverWrite and the Value of the Header 3 is merged
    @Test
    public void OverWriteHeader(){
        RestAssured
                .given()
                .config(RestAssuredConfig.config()
                        .headerConfig(HeaderConfig
                                .headerConfig().overwriteHeadersWithName("Header1","Header2")))
                //If you write any other config like MergeConfig then that config method will be overWrite from the previous one
                //it will take the latest Config what you have given
                .header("Header1","Value1")
                .header("Header1","Value2")//Header value will be OverWrite to the Value2(Header1=Value2)
                .header("Header3","Value3")//Header3=Value3
                .header("Header3","Value4")//Header3=Value4
                .header("Header2","Value5")
                .header("Header2","Value6")//Header value will be overWrite to the value6(Header2=Value6)
                .log()
                .all()
                .when()
                .get();

    }
}
