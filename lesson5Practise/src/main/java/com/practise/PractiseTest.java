package com.practise;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class PractiseTest extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getHeaderNames();
        ServletOutputStream out = resp.getOutputStream();
        while (headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            out.println(headerName + "=" + req.getHeader(headerName));
        }
    }
}
