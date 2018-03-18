package com.swapi.api.clients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swapi.api.engine.RestApiEngine;
import com.swapi.models.Planets;

public class PlanetsApiClient extends AbstractApiClient<Planets>
{

    public PlanetsApiClient(RestApiEngine engine) {
        super(engine);
    }

    @Override
    Class<Planets> getResourceClass() {
        return Planets.class;
    }

    @Override
    String getResourceName() {
        return "planets";
    }

    @Override
    Gson gson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
}
