package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Coockies
 */
@WebServlet("/Coockies")
public class Coockies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Coockies() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		
		Cookie[] cookies = request.getCookies();
		if(cookies== null){
			out.println("No cookie Found");
			
		}else{
		for(Cookie retrivedCookie:cookies){
			
			String name = retrivedCookie.getName();
			String value = retrivedCookie.getValue();
			
			out.println(name + "=" +value+ "<br/>");
			
		}
		}
		Cookie cookie = new Cookie("user", "vicky");
		
		cookie.setMaxAge(300);

		response.addCookie(cookie);
		
		out.println("<br/>Cookie Set.<br/>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
