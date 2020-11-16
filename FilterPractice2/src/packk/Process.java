package packk;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Process
 */
@WebServlet("/Process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection conn=DbConnection.getConnection();
			
			String uname=request.getParameter("uname");	
			String name=request.getParameter("name");	
			String email=request.getParameter("email");	
			String pass=request.getParameter("password");
			String cpass=request.getParameter("cpassword");

			response.setContentType("text/name");
			PrintWriter out=response.getWriter();
			out.println(uname+ " "+name+" "+ email+" " +pass+" "+cpass);
			
			PreparedStatement ps=conn.prepareStatement("insert into filters values(?,?,?,?,?)");
			ps.setString(1, uname);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setString(5, cpass);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("index.jsp");
			}
			
			
				
				
			}catch (Exception e)
				{
					e.printStackTrace();
					
				}
			}
		
		
	}


