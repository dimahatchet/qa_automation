package com.homework6.api.test;

import com.homework3.MyCalculator;
import com.homework6.api.RestAssuredClientImplementation;
import org.junit.Assert;
import org.junit.Test;

public class MyCalculatorApiTest {

    @Test
    public void test1(){
        MyCalculator calc = new MyCalculator();
        Integer expected = 3;
        apiClient = new RestAssuredClientImplementation();
        Integer actual = apiClient.getEvaluate("2+1").getResult();
        Assert.assertEquals(expected, actual);
    }
}
