package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
     response.setContentType("text/html");
     PrintWriter out = response.getWriter();
     out.println("<h2>Welcome to Register Servlet</h2>");
     String name = request.getParameter("user_name");
     String email = request.getParameter("user_email");
     String gender = request.getParameter("user_gender");
     String course = request.getParameter("user_course");
     String condition = request.getParameter("user_condition");
     
     System.out.println(condition);
     if("checked".equals(condition) ){
     
     }
     else{
              out.println("<h2>Agreement must be checked</h2>");
     }
    }
}