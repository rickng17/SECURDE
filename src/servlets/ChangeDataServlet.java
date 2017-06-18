package servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;

/**
 * Servlet implementation class ChangeDataServlet
 */
@WebServlet("/ChangeDataServlet")
public class ChangeDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeDataServlet() {
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
		HttpSession session = request.getSession(true);
		UserBean user = (UserBean)session.getAttribute("currentSessionUser");
		
		UserBean newUser = new UserBean();
		newUser.setUserName(request.getParameter("un"));
	    newUser.setPassword(request.getParameter("pw"));
		
		Enumeration<String> e = getServletContext().getAttributeNames();
	    boolean valid = false;
	    for(; e.hasMoreElements() ;){
	    	String name = (String)e.nextElement();
	    	if(name.contains("user")){
	    		UserBean users = (UserBean)getServletContext().getAttribute(name);
	    		if(users.getUsername().equals(user.getUsername()) && users.getPassword().equals(user.getPassword())){
	    			getServletContext().setAttribute(name, newUser);    
	            	session.setAttribute("currentSessionUser",newUser); 
	            	response.sendRedirect(response.encodeRedirectURL("LoggedIn.jsp"));
	    		}
	    	}
	    }
	}

}
