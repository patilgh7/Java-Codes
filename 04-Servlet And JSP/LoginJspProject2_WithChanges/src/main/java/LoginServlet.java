

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		/* Fail zal login tar punha Register.jsp page run zal pahije punha login karnyasathi
		 * yasathi ya code logic extra lihile ahe
		 * */
		
		PrintWriter out = response.getWriter();  // new  change
		
		response.setContentType("text/html");   // new change
		
		if("abc".equals(uname) && "abc@123".equals(pwd)) {
			
			System.out.println("Login Successful.");
			
			request.setAttribute("data", uname);
		
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
			
			rd.forward(request, response);
			
			
		}else {
			System.out.println("Login Failed....");
			
			out.println("Login Failed...try again");   // new change 
			
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp"); // Register.jsp change instead of Failure.jsp
			 
			//rd.forward(request, response);
			
			rd.include(request, response);    // new change
		}
	}

}
