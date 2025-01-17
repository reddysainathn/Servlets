package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Connect
 */
@WebServlet("/Connect")
public class Connect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//For database Connection,the best way is JNDI(Java Naming and Directory Interface data source)
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			out.println("Can't load  Database Driver");
			
			String strClassPath = System.getProperty("java.class.path");
			
			System.out.println("Classpath is :" +strClassPath );
		}
		
		Connection conn = null;
		
		
		
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3333/webshop","root","root");
		} catch (SQLException e) {
			out.println("Can't Connect to DataBase");
			return;
		}
		
		out.println("Connected to Database.");
		
			try {
				conn.close();
			} catch (SQLException e) {
				out.println("Can'close DataBase");
			}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
