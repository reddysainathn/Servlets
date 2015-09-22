package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/sampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    // Default method is GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		PrintWriter out = response.getWriter();
		out.println("<h2 align='center'>Sample Servlet from POST</h2>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost");
		PrintWriter out = response.getWriter();
		out.println("<h2 align='center'>Sample Servlet from POST</h2>");

	
	
	}

}
