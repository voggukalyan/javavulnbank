package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import dao.ContextListener;
import dao.UserDAO;
import dao.UserDAOImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAOImpl userDAO = new UserDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    static final Logger LOGGER = Logger.getLogger(LoginController.class);
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un = request.getParameter("username");
		String pwd = request.getParameter("password");
		PrintWriter out = response.getWriter();
	
		LOGGER.info("login attempted with:"+un);
		//out.println("You are logged into the application..!!");
		 
		
		if (userDAO.login(un, pwd))
		{
			HttpSession session = request.getSession();
			session.setAttribute("user", un);
			
			response.sendRedirect("home.jsp");
			//out.println("You are logged into the application..!!"); 
			
		}
		else
		{
			out.println("<html> You are not "+un+"</html");
			
		}
		
		
		
		
		
		
	}

}
