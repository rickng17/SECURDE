package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(getServletContext().getAttribute("count") == null){
			getServletContext().setAttribute("count", 1);
		}
		else
			getServletContext().setAttribute("count", (int)getServletContext().getAttribute("count") + 1);
		
		String num = Integer.toString((int)getServletContext().getAttribute("count"));
		UserBean user = new UserBean();
		user.setUserName(request.getParameter("un"));
	    user.setPassword(request.getParameter("pw"));
		
		getServletContext().setAttribute("user" + num, user);
		response.sendRedirect("LoginPage.jsp");
	}

}
