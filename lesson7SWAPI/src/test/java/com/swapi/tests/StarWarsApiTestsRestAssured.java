package com.swapi.tests;

import com.swapi.api.clients.PeopleApiClient;
import com.swapi.api.clients.PeopleWookieeApiClient;
import com.swapi.api.clients.PlanetsApiClient;
import com.swapi.api.clients.StarshipsApiClient;
import com.swapi.api.engine.ApacheRestApiEngine;
import com.swapi.api.engine.RestAssuredRestApiEngine;
import com.swapi.models.People;
import com.swapi.models.Planets;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StarWarsApiTestsRestAssured {

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
        Assert.assertEquals(expectedPlanet, lukeHome.getName());
    }

    @Test
    public void countOfFilmsTatooine() {
        int expectedCount = 5;
        Planets tatooine = apiClientPlanets.getById(1).getResponse();
        int actualCount = tatooine.getFilmsUrls().size();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countOfStarships() {
        int expectedCount = 37;
        int actualCount = apiClientStarships.getCollection()
                .getResponse()
                .getCount();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void checkLukeOnWookie() {
        String expectedName = "Lhuorwo Sorroohraanorworc";
        String actualName = apiClientPeopleWookiee.getByIdWookie(1).getResponse().getName();
        Assert.assertEquals(expectedName, actualName);
    }
}
