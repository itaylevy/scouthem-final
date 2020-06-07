package model;

public abstract class user {
	
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
	//////////////////////////////
	
    public abstract  user getType();

}
