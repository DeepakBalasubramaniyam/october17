package com.first;

import java.util.HashMap;

public class Businessservice {
	HashMap<String,String> hm=new HashMap<String,String>();
	public Businessservice(){
		hm.put("Narayana", "Narayana");
		hm.put("yuvraj", "yuvraj");
		hm.put("krishna","krishna");
	}
	
	public boolean request(String username,String password){
		if((hm.get(username)==null)||(hm.get(username).trim()=="")){
			return false;
			
		}
		else{
			
			return true;
		}
		
	}
	
	

}
