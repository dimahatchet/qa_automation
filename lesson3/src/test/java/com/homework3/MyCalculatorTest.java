package com.homework3;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MyCalculatorTest {

    private MyCalculator calc;
    private int expected;
    private String expression;


    public MyCalculatorTest(int expected, String expression) {
        this.expected = expected;
        this.expression = expression;
    }
    @Rule
    public SpendTimeLogger logger = new SpendTimeLogger();
    @Parameterized.Parameters(name = "expected {0} expression {1}" )
    public static Collection testDataAdd() {
        return Arrays.asList(new Object[][]{{4, "1+3"}, {5, "2+3"}, {2, "3-1"}});
    }

    @Before
    public void setUP() {
        calc = new MyCalculator();
    }

    @Test
    public void Test1() {
        Assert.assertEquals(expected, calc.calculateExpression(expression));
    }
    @Ignore
    @Test(expected = ArithmeticException.class)
    public void TestDivByZero() {
        calc.calculateExpression("2/0");
    }
    @Ignore
    @Test
    public void TestWrongExpression() {
        Assert.assertFalse(calc.isValidExpression("1 =23"));
    }
}