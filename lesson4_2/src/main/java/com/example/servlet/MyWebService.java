package com.example.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyWebService extends HttpServlet{


    private MyCalculatorForWebService calc = new MyCalculatorForWebService();
    private String expression;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        expression = req.getQueryString();
        resp.setStatus(200);
        resp.getOutputStream().print(calc.calculateExpression(expression));
    }
}
