package com.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	/*public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
	}*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		Businessservice businessservice=new Businessservice();
		
				
	      
		
		boolean result=businessservice.request(username, password);
		
		
		if(result==true){
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
			
			
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			}
			
			
		}
		

		
	}
}
