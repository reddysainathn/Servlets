package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;

import com.vo.ShopCart;

@WebServlet("/mobilePage")
public class MobilePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MobilePageServlet() {
		super();
	}

	// Coockie is a temp file for the client,and client can retain the cookies
	// and submits to server
	// Client will send the request along with coockies to server to process
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String item1 = request.getParameter("item1");
		String item2 = request.getParameter("item2");
		String item3 = request.getParameter("item3");
		
		
		
		ShopCart cart = new ShopCart();
		
		
		//Using Session
		if (item1 != null) {
			cart.getItemList().add(item1);
		}
		if (item2 != null) {
			cart.getItemList().add(item2);
		}
		if (item3 != null) {
			cart.getItemList().add(item3);
		}
		//Session object is provided
		//If no previous sessions,it will create new session
		HttpSession session = request.getSession();
		session.setAttribute("cart", cart);
session.setAttribute("count", cart.getItemList().size());
		/*Using cookies
		 * if (item1 != null) {

			Cookie cookie1 = new Cookie("item1", item1);
			response.addCookie(cookie1);

		}
		if (item2 != null) {

			Cookie cookie2 = new Cookie("item2", item2);
			response.addCookie(cookie2);

		}
		if (item3 != null) {

			Cookie cookie3 = new Cookie("item3", item3);
			response.addCookie(cookie3);

		}
*/
		RequestDispatcher requestDispacher = request.getRequestDispatcher("soaps.jsp");
		requestDispacher.forward(request, response);
	}

}
