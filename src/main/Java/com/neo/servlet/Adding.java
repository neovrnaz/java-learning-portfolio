package com.neo.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Adding extends HttpServlet {
        public void service(HttpServletRequest request, HttpServletResponse response) {
                int i = Integer.parseInt(request.getParameter("num1"));
                int j = Integer.parseInt(request.getParameter("num2"));
                int k = i + j;

                if (k <= 1) {
                        System.out.println("Try again");
                } else {
                        System.out.println("result is " + k);
                }
        }
}

// TODO: Change pages from "Adding.java" to "ProjectServlet.java" (only appear if the sum of i & j is greater than or equal to 1)