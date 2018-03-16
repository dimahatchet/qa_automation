package com.homework6.api.test;

import com.homework3.MyCalculator;
import com.homework6.api.ApacheClientImplementation;
import com.homework6.api.RestAssuredClientImplementation;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ResponseCache;

public class MyCalculatorApiClientTest {

    @Test
    public void testRestAssured(){
        Integer expected = 3;
        RestAssuredClientImplementation apiClient = new RestAssuredClientImplementation();
        Assert.assertEquals(expected, Integer.valueOf(apiClient.getEvaluate("2+1")));
    }

    @Test
    public void testApacheClient(){
        Integer expected = 3;
        ApacheClientImplementation apiClient = new ApacheClientImplementation();
        Assert.assertEquals(expected, Integer.valueOf(apiClient.getEvaluate("2+1")));
    }

    @Test
    public void testDirectRestAssured(){
        Response response = RestAssured.given().baseUri("http://localhost:8080")
                .urlEncodingEnabled(false)
                .param("2+1")
                .log().ifValidationFails()
                .expect()
                .statusCode(200)
                .log().ifValidationFails()
                .when()
                .get("/lesson4_2/evaluate");

        Integer actual = Integer.valueOf(response.getBody().print());
        Integer expected = 3;

        Assert.assertEquals(expected, actual);
    }
}
