package model;

import java.io.Serializable;

public abstract class user implements Serializable{

	private String userName;
	private String password;
	//////////////////////////////
	
	public user(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
	}
	public user() {

	}
	///////////////////////////////
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
			this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
