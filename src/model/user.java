package model;

public abstract class user {
	
	protected String userName;
	protected String password;
	//////////////////////////////
	
	public user(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public user() {

	}
	
	///////////////////////////////
	
public abstract String getUserName();
public abstract void setUserName(String userName);
public abstract String getPassword();
public abstract void setPassword(String password);

}
