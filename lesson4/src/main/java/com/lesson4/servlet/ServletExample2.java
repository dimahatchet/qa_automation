package com.lesson4.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Scanner;


public class ServletExample2 extends HttpServlet {
    private User lastSavedUser;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (lastSavedUser == null) {
            resp.setStatus(404);
            return;
        }
        resp.setStatus(200);
        resp.getOutputStream().print(lastSavedUser.toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Scanner sc = new Scanner(req.getInputStream());
        String receivedUser = sc.nextLine();
        User createdUser = User.create(receivedUser);
        lastSavedUser = createdUser;
        resp.setStatus(200);
    }
}

