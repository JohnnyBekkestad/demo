package se.johnny.demo.common.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private String id;
	private String name;
	
	public User(){
		
	}
	
	public User(String id){
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
