package sev;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*	0.
	RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
	rd.forward(request, response);
	
	with this we can access the request object even in next servlet which is not the case with redirect method that's why we 
	we use HttpSession due to limitation of request object scope
	*/
		String str=request.getParameter("t3");
		
/*    1.
		HttpSession session=request.getSession();
		session.setAttribute("t1",str);
	*/	
		//we can also use cookies in place of HttpSession
		
	/*2.	Cookie cookie=new Cookie("t1", str);
		response.addCookie(cookie);
		
		
		response.sendRedirect("SecondServlet");
		*/
	
	response.sendRedirect("SecondServlet?t3="+str);
	}


}
