package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import java.util.Enumeration;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserBean user = new UserBean();
	    user.setUserName(request.getParameter("un"));
	    user.setPassword(request.getParameter("pw"));
		
	    Enumeration<String> e = getServletContext().getAttributeNames();
	    boolean valid = false;
	    for(; e.hasMoreElements() ;){
	    	String name = (String)e.nextElement();
	    	if(name.contains("user")){
	    		UserBean users = (UserBean)getServletContext().getAttribute(name);
	    		if(users.getUsername().equals(user.getUsername()) && users.getPassword().equals(user.getPassword())){
	    			valid = true;
	    		}
	    	}
	    }
	    
		if(valid){
			HttpSession session = request.getSession(true);	    
        	session.setAttribute("currentSessionUser",user); 
        	response.sendRedirect(response.encodeRedirectURL("LoggedIn.jsp"));
		}
		else{
			getServletContext().setAttribute("wrong", true);
			response.sendRedirect(response.encodeRedirectURL("LoginPage.jsp"));
		}
	}

}
