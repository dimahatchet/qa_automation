package com.swapi.api.clients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swapi.api.engine.RestApiEngine;
import com.swapi.models.PeopleWookiee;


public class PeopleWookieeApiClient extends AbstractApiClient<PeopleWookiee>
{

    public PeopleWookieeApiClient(RestApiEngine engine) {
        super(engine);
    }

    @Override
    Class<PeopleWookiee> getResourceClass() { return PeopleWookiee.class; }

    @Override
    String getResourceName() { return "people"; }

    @Override
    Gson gson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
}
