package model;

import java.util.ArrayList;

public class userList {

	private ArrayList<user> userList=new ArrayList<user>();
	//////////////////////////////
	
	public userList() {
	}
	/////////////////////////////

	public ArrayList<user> getUserList() {
		return  userList;
	}
	////////////////////////////
	
	public void addUser(user u)
	{
		userList.add(u);		
	}
	public boolean CheckingUsername(String userName)
	{
		for(int i=0; i< userList.size(); i++) {
			if(userList.get(i).getUserName() == userName) {
				System.out.println("Choose a different username");
				return false;
			}
		}
		return true;	
	}
	public user login(String userName, String password)
	{
		int i;
		int flag=0;
		
		for(i=0;i<userList.size();i++)
		{
			if( (userList.get(i).getUserName() == userName) && (userList.get(i).getPassword() == password) ) {
				flag=1;
				break;
			}
		}
		
		if(flag == 0)
		{
			 System.out.println("wrong username or password");
			 return null;
		}
		
		return userList.get(i).getType();		
	}
	
}
