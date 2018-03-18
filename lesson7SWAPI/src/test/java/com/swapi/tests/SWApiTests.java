package com.swapi.tests;

import com.swapi.api.clients.PeopleApiClient;
import com.swapi.api.engine.ApacheRestApiEngine;
import com.swapi.api.engine.RestAssuredRestApiEngine;
import com.swapi.models.People;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SWApiTests {

    private static PeopleApiClient apiClient;

    @BeforeClass
    public static void setupApiClient()
    {
        apiClient = new PeopleApiClient(new ApacheRestApiEngine());
    }

    @Test
    public void testLuke() {
        String expectedName = "Luke Skywalker";
        People luke = apiClient.getById(1).getResponse();
        Assert.assertEquals(expectedName, luke.getName());
    }

    @Test
    public void testCount() {
        int expected = 87;
       int actual  = apiClient.getCollection()
               .getResponse()
               .getCount();
        Assert.assertEquals(expected, actual);
    }
}
