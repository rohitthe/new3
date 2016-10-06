package com.psl.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId = request.getParameter("uname");
        String password = request.getParameter("password");
        try {
        	if(userId.equalsIgnoreCase("root") && password.equalsIgnoreCase("admin"))
			{
				HttpSession session = request.getSession(true);
				session.setAttribute("userId",userId);
				response.sendRedirect("LoginSuccess.jsp");
			}else
				response.sendRedirect("LoginFailed.jsp");
        } 
        catch (Throwable e) {
            System.out.println("Throwable Exception occured: " + e.getMessage());
            //e.printStackTrace();
        }
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
