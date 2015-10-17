package jsonbasics;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.*;

public class jsonvaluewithuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=input.nextLine();
		System.out.println("Enter the salary:");
		String salary=input.nextLine();
		System.out.println("Enter the age:");
		String age=input.nextLine();
		
		String s="{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";  
		  
	    Object obj=JSONValue.parse(s);  
	    JSONObject jsonObject = (JSONObject) obj;  
	  
	    String newname = (String) jsonObject.get("name");  
	    double newsalary = (Double) jsonObject.get("salary");  
	    long newage = (Long) jsonObject.get("age");  
	    System.out.println(newname+" "+newsalary+" "+newage);  

		System.out.println("Narayana");


	}

}
