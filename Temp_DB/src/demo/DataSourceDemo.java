package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class DataSourceDemo
 */
@WebServlet("/DataSourceDemo")
public class DataSourceDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private DataSource ds ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataSourceDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		
		try {
			InitialContext initContext = new InitialContext();
			
			Context env =(Context) initContext.lookup("java:comp/env");
			
			ds = (DataSource) env.lookup("jdbc/webshop");
			
			
		} catch (NamingException e) {
			throw new  ServletException();
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			 conn = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		} 
		//Use Connection
		
		PrintWriter out = response.getWriter();
		
		out.println("Connected to DataBase");
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
