package com.swapi.api.clients;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.swapi.api.engine.RestApiEngine;
import com.swapi.api.models.ApiHttpResponse;
import com.swapi.api.models.SWApiHttpResponse;
import com.swapi.models.SWCollection;
import java.lang.reflect.Type;

public abstract class AbstractApiClient<T> {

    private final RestApiEngine engine;
    private final Type collectionType;
    private final Type entityType;
    private static final String BASE_URL = "http://swapi.co/api";

    AbstractApiClient(final RestApiEngine engine) {
        this.engine = engine;
        this.collectionType = TypeToken.getParameterized(SWCollection.class, getResourceClass()).getType();
        this.entityType = getResourceClass();
    }

    public SWApiHttpResponse<T> getById(final int entityId){
        final String url = String.format("%s/%s/%d", BASE_URL, getResourceName(), entityId);
        return getById(url);
    }

    public SWApiHttpResponse<T> getById(final String url){
        return getGenericResponse(url,entityType);
    }
    public SWApiHttpResponse<T> getByIdWookie(final int entityId){
        final String url = String.format("%s/%s/%d" + "/?format=wookiee", BASE_URL, getResourceName(), entityId);
        return getById(url);
    }

    public SWApiHttpResponse<T> getByIdWookie(final String url){
        return getGenericResponse(url,entityType);
    }

    public SWApiHttpResponse<SWCollection<T>> getCollection(){
        final String url = String.format("%s/%s/", BASE_URL, getResourceName());
        return getCollection(url);
    }

    public SWApiHttpResponse<SWCollection<T>> getCollection(final String url){
        return getGenericResponse(url,collectionType);
    }
    private <GT> SWApiHttpResponse<GT> getGenericResponse(final String url, final Type responseType){
        ApiHttpResponse httpResponse = engine.get(url);
        SWApiHttpResponse<GT> response = new SWApiHttpResponse<>(httpResponse);
        if (isSuccess(httpResponse.getStatusCode())){
            response.setResponse(gson().fromJson(httpResponse.getBody(), responseType));
        }
        return response;
    }
    abstract Class<T> getResourceClass();
    abstract String getResourceName();
    abstract Gson gson();

    public boolean isSuccess(final int statusCode){
        return String.valueOf(statusCode).matches("^[1-2]\\d{2}$");
    }
}
