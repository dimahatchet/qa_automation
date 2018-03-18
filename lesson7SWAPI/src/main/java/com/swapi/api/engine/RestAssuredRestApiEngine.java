package com.swapi.api.engine;

import com.swapi.api.models.ApiHttpResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class RestAssuredRestApiEngine implements RestApiEngine {
    @Override
    public ApiHttpResponse get(String url) {
        Response response = RestAssured.given()
                .baseUri(url)
                .contentType("application/json; charset=utf-8")
                .expect()
                .statusCode(200).log().all()
                .when()
                .get();
        ApiHttpResponse apiResponse = response.as(ApiHttpResponse.class);
        apiResponse.setBody(response.getBody().print());
        apiResponse.setStatusCode(response.getStatusCode());
        apiResponse.setStatusMessage(response.getStatusLine());
        return apiResponse;
    }
}
