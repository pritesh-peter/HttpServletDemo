package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
     response.setContentType("text/html");
     System.out.println("Get method of MyServlet");
     PrintWriter out = response.getWriter();
     out.print("<h1>This is the Get Method of httpservlet</h1>");
     out.print(new Date().toString());
     
     
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
