package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class userList implements Serializable{
	
	private final String FILENAME = "users.txt";
	private List<user> userList; 
	private final String FILENAME1 = "players.txt";
	private List<player> playersList;
	
	public userList(){
		  readUsersFile();
		  readPlayersFile();
	}

	public List<user> getUserList(){
		readUsersFile();
		return  userList;
	}
	public List<player> getPlayerList(){
		readPlayersFile();
		return  playersList;
	}
	
	public void addUser(user u)
	{
		userList.add(u);
		writeToUserListFile(userList);
	}
	public user login(String userName, String password)
	{
		for(int i=0;i<playersList.size();i++)
		{
			 if((playersList.get(i).getUserName().equals(userName)) && (playersList.get(i).getPassword().equals(password))) 
			 {
					return playersList.get(i);
			 }
		}
		

		for(int i=0;i<userList.size();i++)
		{
			 if((userList.get(i).getUserName().equals(userName)) && (userList.get(i).getPassword().equals(password))) 
			 {
					return userList.get(i);
			 }
		}
		return null;
	}
	public void signUpPlayer(String playerName ,String team, String role, int age, double height, double weight, String mail, int idPlayer,String userName, String password)
	{
		user P = new player(playerName, team, role, age, height, weight, mail, idPlayer, userName, password);
		userList.add(P);
		playersList.add((player) P);
		writeToUserListFile(userList);
		writeToListPlayersFie(playersList);
	}
	public void signUpScout(String scoutName, String team, int scoutId, String userName, String password)
	{	
		user U = new scout(scoutName, team, scoutId, userName,password);
		userList.add(U);
		writeToUserListFile(userList);

	}
	public void writeToUserListFile(List<user> userList) {
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME)))
		{
			objectOutputStream.writeObject(userList);
			objectOutputStream.flush();
			objectOutputStream.close();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
		
	public void writeToListPlayersFie(List<player> ArraylistPlayer) {
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME1)))
		{
			objectOutputStream.writeObject(ArraylistPlayer);
			objectOutputStream.flush();
			objectOutputStream.close();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void readUsersFile(){
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME))) 
		  {
			  userList = (List<user>) input.readObject();
			  input.close();
		  }
		catch (Exception e) 
		  {
			  userList = new ArrayList<user>();
		  }
	}
	public void readPlayersFile() {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME1))) 
		  {
			  playersList = (List<player>) input.readObject();
			  input.close();

		  } 
		  catch (Exception e) 
		  {
			  playersList= new ArrayList<player>();
		  }	
	
	}
		
}
