package com.homework6.api;


import io.restassured.RestAssured;

public class RestAssuredClientImplementation implements MyCalculatorApiClient {

    public String getEvaluate(String expression) {
        return RestAssured.given().baseUri("http://localhost:8080")
                .contentType("text/html;charset=UTF-8")
                .urlEncodingEnabled(false)
                .param(expression )
                .log().all()
                .expect()
                .statusCode(200).log().all()
                .when()
                .get("/lesson4_2/evaluate")
                .getBody()
                .print();
    }
}
