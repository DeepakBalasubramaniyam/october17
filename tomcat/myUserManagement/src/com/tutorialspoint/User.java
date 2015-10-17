
package com.tutorialspoint;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User implements Serializable {

	//   private static final long serialVersionUID = 1L;
	private int id;

	public User(){}

	public User(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	
	public String toJson(){
		return "{\"id\": id }";
	}
}
