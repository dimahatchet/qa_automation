package com.lesson4.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletExample extends HttpServlet {

    private MyCalcServlet calc = new MyCalcServlet();
    private String expression;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/text");
        resp.getOutputStream().print(calc.calculateExpression(expression));
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        expression = req.getQueryString();
    }
}
