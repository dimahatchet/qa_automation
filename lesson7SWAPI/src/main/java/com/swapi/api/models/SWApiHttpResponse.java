package com.swapi.api.models;

public class SWApiHttpResponse<T> extends ApiHttpResponse {
    private ApiHttpResponse apiHttpResponse;
    private T response;

    public SWApiHttpResponse(ApiHttpResponse httpResponse) {
        this.apiHttpResponse = httpResponse;
    }

    public ApiHttpResponse getApiHttpResponse() {return apiHttpResponse; }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
