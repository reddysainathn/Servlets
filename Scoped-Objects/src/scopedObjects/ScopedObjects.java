package scopedObjects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopedObjects
 */
@WebServlet("/ScopedObjects")
public class ScopedObjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopedObjects() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//Request Scope
		
		request.setAttribute("test", "Hello");
	
		String test = (String) request.getAttribute("test");
		
		//Session Scope
		
	HttpSession session=	request.getSession();
	 
    session.setAttribute("test", "hello");
	
	String test1 = (String) session.getAttribute("test");

	
	//Application Scope
	
	ServletContext context = getServletContext();
	
context.setAttribute("test", "hello");
	
	String test2 = (String) context.getAttribute("test");
	
	
	
	String adminName = context.getInitParameter("adminname");
	PrintWriter out = response.getWriter();
	out.println("<p>"+adminName+"</p>");
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
