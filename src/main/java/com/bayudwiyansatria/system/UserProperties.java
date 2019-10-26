package com.bayudwiyansatria.system;

public class UserProperties extends Properties {
	private String USERNAME;
	
	/* USER PROPERTIES */
	public void setSystemUsername(String username){
		this.USERNAME = username;
	}
	
	public String getSystemUsername(){
		if ( USERNAME == null ){
			setSystemUsername ( System.getProperty("user.name") );
		}
		return USERNAME;
	}
}
