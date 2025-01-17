package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vo.ShopCart;

/**
 * Servlet implementation class ClothesPageServlet
 */
@WebServlet("/clothesPage")
public class ClothesPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClothesPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
    	String item7 = request.getParameter("item7");
		String item8 = request.getParameter("item8");
		String item9 = request.getParameter("item9");
		// if there is already a session associated with client then getSession() retrieves that Id, otherwise it creates new one . correct?
		
		HttpSession session = request.getSession();
		
		ShopCart cart = (ShopCart) session.getAttribute("cart");
		session.setAttribute("count", cart.getItemList().size());
		PrintWriter out = response.getWriter();
		
		out.println(session.getId());

		if (item7 != null) {
			cart.getItemList().add(item7);
		}
		if (item8 != null) {
			cart.getItemList().add(item8);
		}
		if (item9 != null) {

			cart.getItemList().add(item9);
		}
		
		List<String> itemsList = cart.getItemList();
		
		int i=0;
		for (String string : itemsList) {
			
			out.println(++i+")"+string);
			out.println("<br>");
		}
		
		//Destroys the session
		session.invalidate();

	/*	if (item7 != null) {

			Cookie cookie1 = new Cookie("item7", item7);
			response.addCookie(cookie1);

		}
		if (item8 != null) {

			Cookie cookie2 = new Cookie("item8", item8);
			response.addCookie(cookie2);

		}
		if (item9 != null) {

			Cookie cookie3 = new Cookie("item9", item9);
			response.addCookie(cookie3);

		}
    	
    	Cookie[] coockies = request.getCookies();
    	PrintWriter out = response.getWriter();
    	
    	out.println("<h3 align='center'>Selected Items </h3>");
    	out.println("<h3>Item Details:</h3>");
    	out.println("");
    	int i=0;
    	for (Cookie cookie : coockies) {
			
    		switch (cookie.getName()) {
			case "item1":
				out.println(++i+")"+cookie.getValue());
				out.println("<br>");
				cookie.setMaxAge(0);
				break;
			case "item2":
				out.println(++i+")"+cookie.getValue());
				out.println("<br>");
				cookie.setMaxAge(0);
				break;
			case "item3":
				out.println(++i+")"+cookie.getValue());
				out.println("<br>");
				cookie.setMaxAge(0);
				break;
			case "item4":
				out.println(++i+")"+cookie.getValue());
				out.println("<br>");
				cookie.setMaxAge(0);
				break;
			case "item5":
				out.println(++i+")"+cookie.getValue());
				out.println("<br>");
				cookie.setMaxAge(0);
				break;
			case "item6":
				out.println(++i+")"+cookie.getValue());
				out.println("<br>");
				cookie.setMaxAge(0);
				break;
			case "item7":
				out.println(++i+")"+cookie.getValue());
				out.println("<br>");
				cookie.setMaxAge(0);
				break;
			case "item8":
				out.println(++i+")"+cookie.getValue());
				out.println("<br>");
				cookie.setMaxAge(0);
				break;
			case "item9":out.println(++i+")"+cookie.getValue());
			out.println("<br>");
			cookie.setMaxAge(0);
			break;
				
			default:
				break;
			}
		}*/
    	
		

		
	}
}
