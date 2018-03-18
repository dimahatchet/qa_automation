package com.swapi.api.engine;

import com.swapi.api.models.ApiHttpResponse;
import io.restassured.RestAssured;


public class RestAssuredRestApiEngine implements RestApiEngine {
    @Override
    public ApiHttpResponse get(String url) {
        return RestAssured.given().baseUri(url)
                .expect()
                .statusCode(200).log().all()
                .when()
                .get()
                .getBody()
                .as(ApiHttpResponse.class);
    }
}
