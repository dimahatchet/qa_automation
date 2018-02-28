package com.lesson3;

import com.homework3.SpendTimeLogger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private int a,b,expected;

    public CalculatorTest(int a, int b, int expected)
    {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Rule public SpendTimeLogger logger = new SpendTimeLogger();
    @Parameterized.Parameters(name = "a={0} b={1} expected = {2}")
    public static Collection<Object[]> inputs(){
        return Arrays.asList(new Object[][]{
                {1,1,2},
                {5,-10,-5},
                {8,0,8}
        });
    }

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        Assert.assertNotNull(calculator);
    }

    @Test
    public void test() {
        Assert.assertEquals(expected, calculator.add(a,b));
    }




}
