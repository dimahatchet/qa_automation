package com.swapi.api.engine;

import com.swapi.api.models.ApiHttpResponse;

public interface RestApiEngine {
    ApiHttpResponse get(final String url);
    ApiHttpResponse get(final String url, final String param);
}