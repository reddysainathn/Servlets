package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/registerProcess")
public class RegisterServlet extends GenericServlet  {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		System.out.println("*********RegisterServlet Service() Method**********");
		
		String firstname =request.getParameter("firstname");
		String lastname =request.getParameter("lastname");
		String city =request.getParameter("city");
		String email =request.getParameter("email");
		String phone =request.getParameter("phone");
		
		
		PrintWriter out =response.getWriter();
		
		out.println("<h2 align='center'>You are registered Successfully</h2>");
		
		out.println("Following are your details<br>");
		
		out.println("FirstName :"+firstname);
		out.println("lastname :"+lastname);
		out.println("city :"+city);
		out.println("email :"+email);
		out.println("phone :"+phone);
	}

}
