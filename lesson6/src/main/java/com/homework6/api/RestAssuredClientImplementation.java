package com.homework6.api;

import com.jayway.restassured.RestAssured;

public class RestAssuredClientImplementation implements MyCalculatorApiClient {
    public String getEvalute(String expression) {
        return RestAssured.given().baseUri("http://localhost:8080")
                .body(expression)
                .expect()
                .statusCode(200)
                .when()
                .get("/lesson4_2");
    }
}
