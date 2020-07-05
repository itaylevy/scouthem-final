package model;

import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class userList implements Serializable {
	
	private final String FILENAME = "users";
	private List<user> userList;
	private final String FILENAME1 = "players";
	private List<user> ArraylistPlayer;
	//////////////////////////////
	
	public userList() {

	}
	/////////////////////////////

	public List<user> getUserList() {
		return  userList;
	}
	////////////////////////////
	
	public void addUser(user u)
	{
		userList.add(u);		
	}
	public user login(String userName, String password) 
	{	

		  try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME))) {
			  userList = (List<user>) input.readObject();
			  
				for(int i=0;i<userList.size();i++)
	    		{
	    			 if( (userList.get(i).getUserName().equals(userName)) && (userList.get(i).getPassword().equals(password)) ) {
	    					return userList.get(i);
	                        //return true;
	    			 }
	    		}
	    		return null;
	            //return false;
		  } catch (Exception e) {
			     e.printStackTrace();
			  }
			return null;	  
	}
	public void singUpPlayer(String playerName,String team, String role, int age, double height, double weight, String mail, int idPlayer,String userName, String password)
	{
		user P = new player(playerName, team, role, age, height, weight, mail, idPlayer, userName, password);
		userList.add(P);
		ArraylistPlayer.add(P);
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))){
			objectOutputStream.writeObject(userList);
		}catch(IOException e) {
			e.printStackTrace();		
		}
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME1))){
			objectOutputStream.writeObject(ArraylistPlayer);
		}catch(IOException e) {
			e.printStackTrace();		
		}
		
	}
	public void singUpScout(String scoutName, String team, int scoutId, String userName, String password)
	{	
		user U = new scout(scoutName, team, scoutId, userName,password);
		userList.add(U);
	
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))){
			objectOutputStream.writeObject(userList);
		}catch(IOException e) {
			e.printStackTrace();		
		}

	}
		
}
