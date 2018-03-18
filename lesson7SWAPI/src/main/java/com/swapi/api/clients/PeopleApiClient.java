package com.swapi.api.clients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swapi.api.engine.RestApiEngine;
import com.swapi.models.People;

public class PeopleApiClient extends AbstractApiClient<People>
{

    public PeopleApiClient(RestApiEngine engine) {
        super(engine);
    }

    @Override
    Class<People> getResourceClass() { return People.class; }

    @Override
    String getResourceName() { return "people"; }

    @Override
    Gson gson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
}
