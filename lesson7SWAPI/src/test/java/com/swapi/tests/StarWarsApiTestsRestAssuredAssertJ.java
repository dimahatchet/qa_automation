package com.swapi.tests;

import com.swapi.api.clients.PeopleApiClient;
import com.swapi.api.clients.PeopleWookieeApiClient;
import com.swapi.api.clients.PlanetsApiClient;
import com.swapi.api.clients.StarshipsApiClient;
import com.swapi.api.engine.RestAssuredRestApiEngine;
import com.swapi.models.People;
import com.swapi.models.Planets;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StarWarsApiTestsRestAssuredAssertJ {

    private static PeopleApiClient apiClientPeople;
    private static PeopleWookieeApiClient apiClientPeopleWookiee;
    private static PlanetsApiClient apiClientPlanets;
    private static StarshipsApiClient apiClientStarships;

    @BeforeClass
    public static void setupApiClient()
    {
        apiClientPeople = new PeopleApiClient(new RestAssuredRestApiEngine());
        apiClientPlanets = new PlanetsApiClient(new RestAssuredRestApiEngine());
        apiClientStarships = new StarshipsApiClient(new RestAssuredRestApiEngine());
        apiClientPeopleWookiee = new PeopleWookieeApiClient(new RestAssuredRestApiEngine());
    }

    @Test
    public void checkLukeIsFromTatooine() {
        String expectedPlanet = "Tatooine";
        People luke = apiClientPeople.getById(1).getResponse();
        Planets lukeHome = apiClientPlanets.getById(luke.gethomeWorldUrl()).getResponse();
        Assertions.assertThat(lukeHome.getName()).isEqualToIgnoringCase(expectedPlanet);
    }

    @Test
    public void countOfFilmsTatooine() {
        int expectedCount = 5;
        Planets tatooine = apiClientPlanets.getById(1).getResponse();
        int actualCount = tatooine.getFilmsUrls().size();
        Assertions.assertThat(tatooine.getFilmsUrls()).hasSize(expectedCount);
    }

    @Test
    public void countOfStarships() {
        int expectedCount = 37;
        int actualCount = apiClientStarships.getCollection()
                .getResponse()
                .getCount();
        Assertions.assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    public void checkLukeOnWookiee() {
        String expectedName = "Lhuorwo Sorroohraanorworc";
        String actualName = apiClientPeopleWookiee.getByIdWookiee(1).getResponse().getName();
        Assertions.assertThat(actualName).isEqualTo(expectedName);
    }
}
