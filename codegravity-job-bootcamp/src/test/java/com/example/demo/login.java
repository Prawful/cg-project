package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

public class login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve data from the form
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");

        // Check the userid and password against the database (not shown in this example)

        // If login is successful, redirect to a welcome page; otherwise, show an error (not shown in this example)
    }
}
