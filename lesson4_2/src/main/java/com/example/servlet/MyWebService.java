package com.example.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyWebService extends HttpServlet {


    private MyCalculatorForWebService calc = new MyCalculatorForWebService();
    private String expression;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html; charset=UTF-8");
        expression = req.getParameter("expression");
        if (expression == null || expression.length()== 0) {
            resp.getOutputStream().println("Empty expression");}
            else if (calc.isValidExpression(expression)){
                resp.getOutputStream().print(calc.calculateExpression(expression));
                resp.setStatus(200);
            } else resp.getOutputStream().println("Not valid expression");
    }
}
