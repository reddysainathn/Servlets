package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.EscapeTokenizer;


@WebServlet("/validateUnameServ")
public class ValidateUName extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<String> usernameList = new  ArrayList<String>();
	
	
	@Override
	public void init() throws ServletException {
		
		
		usernameList.add("hary");
		usernameList.add("kumar");
		usernameList.add("raj");
		
		
	}
	
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		
   		String username = request.getParameter("username");
   		
   		PrintWriter out = response.getWriter();
   		
   		
   		if(usernameList.contains(username)){
   			
   				out.println("<font color='red'>Username is already taken.</font>");
   		}else {
   			out.println("<font color='green'>Username is available.</font>");
		}
   	
   	}

}
