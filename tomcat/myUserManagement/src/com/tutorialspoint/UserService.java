
package com.tutorialspoint;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

@Path("/UserService")
public class UserService {

   UserDao userDao = new UserDao();

   @GET
   @Path("/users")
   public JSONObject getUsers(HttpServletResponse resp) throws IOException{
      User user = new User(1);
      PrintWriter out = resp.getWriter();
      JSONObject jsonUser = new JSONObject();
      jsonUser.append("User", user);
      
      return jsonUser;
      
   }
   
}
