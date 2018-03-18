package com.swapi.api.clients;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swapi.api.engine.RestApiEngine;
import com.swapi.models.Starships;

public class StarshipsApiClient  extends AbstractApiClient<Starships>
{

    public StarshipsApiClient(RestApiEngine engine) {
        super(engine);
    }

    @Override
    Class<Starships> getResourceClass() {
        return Starships.class;
    }

    @Override
    String getResourceName() {
        return "starships";
    }

    @Override
    Gson gson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
}

