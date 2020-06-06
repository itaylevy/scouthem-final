package model;

public abstract class user {
	
	private String userName;
	private String password;
	private userList ul;
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
		//if(ul.CheckingUsername(userName)){
			this.userName = userName;
		//}
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
