package packk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FormFilter
 */
@WebFilter("/Process")
public class FormFilter implements Filter {

    /**
     * Default constructor. 
     */
    public FormFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String uname=request.getParameter("uname");	
		String name=request.getParameter("name");	
		String email=request.getParameter("email");	
		String pass=request.getParameter("password");
		String cpass=request.getParameter("cpassword");
		
		//response.setContentType("text/name");
		PrintWriter out=response.getWriter();
		
		if(uname.equals(""))
		{
			String msg="** user name can't be empty";
			request.setAttribute("message", msg);
		}
		 if(name.equals(""))
		{
			 String msg2="** name can't be empty";
			 request.setAttribute("message2", msg2);
			//request.getRequestDispatcher("index.jsp").include(request, response);

		}
		 if(email.equals(""))
		{
			 String msg3="** email can't be empty";
			 request.setAttribute("message3", msg3);
			//request.getRequestDispatcher("index.jsp").include(request, response);

		}
		if(pass.equals(""))
		{
			request.setAttribute("message4", "** password can't be empty");
		}
		if(cpass.equals(""))
		{
			request.setAttribute("message5", "** confirm password can't be empty");
		}
		if(!pass.equals(cpass))
		{

			out.println("your password is not matching...");
		}
		if(uname.equals("")|| name.equals("")|| email.equals("")||pass.equals("")|| cpass.equals(""))
		{
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		else {
		chain.doFilter(request, response);
	}}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
