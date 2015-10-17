package com.login;

import java.util.HashMap;

public class Businessservice {
	HashMap<String,String> hm=new HashMap<String,String>();
	public Businessservice(){
		hm.put("narayana", "narayana");
		hm.put("yuvraj", "yuvraj");
		hm.put("krishna","krishna");
	}
	
	
	
	/*public boolean request(String username,String password){
		if((username==null)||(username.trim()=="")){
			return false;
			
		}
		else{
			
			return true;
		}
		
	}*/ 
	
	
	
	public boolean request(String username,String password){
		if((hm.get(username)==null)||(hm.get(username).trim()=="")){
			return false;
			
		}
		else{
			
			return true;
		}
		
	}
	
	

}
