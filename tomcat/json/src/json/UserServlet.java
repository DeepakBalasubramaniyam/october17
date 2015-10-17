package json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class UserServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		User user = new User();
		user.setId(5);
		user.setUsername("Vijay");
		
		JSONObject jsonUser = new JSONObject();
		jsonUser.append("user", user);
		
		PrintWriter out = resp.getWriter();
		
		out.print(jsonUser);
		
		
	}

}
