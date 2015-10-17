package jsonbasics;

import org.json.simple.JSONObject;

public class firstjsonclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject obj=new JSONObject();    
		  obj.put("name","sonoo");    
		  obj.put("age",new Integer(27));    
		  obj.put("salary",new Double(600000));    
		   System.out.println(obj);

		
	}

}
