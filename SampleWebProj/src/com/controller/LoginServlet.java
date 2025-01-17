package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends GenericServlet implements Servlet {
	Map<String, String> userDetails = new HashMap<String,String>();

	@Override
	public void init(ServletConfig config) throws ServletException {

		userDetails.put("hary", "hary123");
		userDetails.put("john", "john123");
		userDetails.put("kumar", "kumar123");
		
		System.out.println(userDetails);
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException ,IOException {
		
	
		
		System.out.println("LoginServlet Called");
		
		
		String username=request.getParameter("username");
		
		String password=request.getParameter("password");
		
		System.out.println("Got parameters");
		System.out.println(username);
		System.out.println(password);
		if(userDetails.containsKey(username)){
			
			if(userDetails.get(username).equals(password)){
				RequestDispatcher dispacher = request.getRequestDispatcher("AccountServlet");
				dispacher.forward(request, response);
			}else{
				RequestDispatcher dispacher = request.getRequestDispatcher("login.html");
				dispacher.forward(request, response);
				System.out.println("I am out-1");
			}
		}else{
			RequestDispatcher dispacher = request.getRequestDispatcher("login.html");
			dispacher.forward(request, response);
			System.out.println("I am out-2");

			}
		
		
		
		
		
	}}