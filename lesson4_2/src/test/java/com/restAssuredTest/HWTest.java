package com.restAssuredTest;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class HWTest {

    @Test
    public void test(){
        Response response = RestAssured.given().baseUri("http://192.168.88.62:8080")
                .log().ifValidationFails()
                .expect()
                .statusCode(200)
                .log().ifValidationFails()
                .when()
                .get("/Calculator");

        String actualResp = response.asString();
        String expectedResp = "Hello world";

        Assert.assertEquals(expectedResp, actualResp);
    }

}
