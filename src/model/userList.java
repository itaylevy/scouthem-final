package model;

import java.util.ArrayList;

public class userList {

	private ArrayList<user> userList=new ArrayList<user>();
//	private T user;
	//////////////////////////////
	
	public userList() {
		user s=new scout("oz","hapoel tel aviv", 233465583, "oz", "1");
		userList.add(s);
	}
	/////////////////////////////

	public ArrayList<user> getUserList() {
		return  userList;
	}
//	public T getUser() {
//		return user;
//	}
	////////////////////////////
	
	public void addUser(user u)
	{
		userList.add(u);		
	}
	public boolean CheckingUserName(String userName)
	{
		for(int i=0; i<userList.size(); i++) {
			if(userList.get(i).getUserName() == userName) {
				System.out.println("Choose a different username");
				return false;
			}
		}
		return true;	
	}
	public boolean login(String userName, String password)
	{
		for(int i=0;i<userList.size();i++)
		{
			 System.out.println(userList.get(i).getUserName());
			 System.out.println(userList.get(i).getPassword());
			 System.out.println(userName);
			 System.out.println(userList.get(i).getPassword().equals(password));
			 
			 if( (userList.get(i).getUserName().equals(userName)) && (userList.get(i).getPassword().equals(password)) ) {
//					return userList.get(i).getType();
					return true;
			 }
		}
//		user = null;
		return false;
	}
	
}
