package sev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
   	PrintWriter out=response.getWriter();
   	response.setContentType("text/html");
   	out.print("Redirected from 1st to 2nd servlet");
   	out.print("<br>");	
   
   	/*1
   	HttpSession session=request.getSession();
   	String str1=session.getAttribute("t1").toString();
   	*/
   	/*2
    Cookie cookies[]=request.getCookies();
   	
   	String str1=null;
   	
   	for(Cookie c:cookies){
   		
   		if(c.getName().equals("t1")){
   			str1=c.getValue();
   		}
   	}
   */	
   	
   	String str1=request.getParameter("t3");
   	out.print("Hello"+str1);
   	
   	
   	}

	

}
