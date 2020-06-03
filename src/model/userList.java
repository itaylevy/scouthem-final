package model;

import java.util.ArrayList;

public class userList {

	ArrayList<user> users=new ArrayList<user>();	
	/////////////////////////////

	public ArrayList<user> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<user> users) {
		this.users = users;
	}
	public void addUser(user user) {
		users.add(user);
	}
	
}
