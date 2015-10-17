package com.login;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings({ "serial", "deprecation" })
public class LoginServlet extends HttpServlet {
	
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

	

