package com.restAssuredTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class HWTest {
@Ignore
    @Test
    public void test(){
        Response response = RestAssured.given().baseUri("http://localhost:8080")
                .log().ifValidationFails()
                .expect()
                .statusCode(200)
                .log().ifValidationFails()
                .when()
                .get("/lesson4_2");

        String actualResp = response.getBody().print();
        String expectedResp = "Example";

        Assert.assertEquals(expectedResp, actualResp);
    }

}
