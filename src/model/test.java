package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class test {
	
	private final String FILENAME1 = "testPlayers.txt";
	private final String FILENAME2 = "testUers.txt";
	
	private ArrayList<user> testUserList;
	private ArrayList<player> testplayersList;
	
	private userList u;
	private scout s;

	public test() {
		this.testUserList = new ArrayList<user>();
		this.testplayersList = new ArrayList<player>();
		this.u = new userList();
		this.s = new scout();
	}

	public ArrayList<user> getUserList() {
		testReadUsersFile();
		return testUserList;
	}

	public ArrayList<player> getTestplayersList() {
		testReadPlayersFile();
		return testplayersList;
	}
	
	public void testSignUpPlayer(String playerName ,String team, String role, int age, double height, double weight, String mail, int idPlayer,String userName, String password)
	{
		user P = new player(playerName, team, role, age, height, weight, mail, idPlayer, userName, password);
		testUserList.add(P);
		testplayersList.add((player) P);
		testWriteToUserListFile(testUserList);
		testWriteToPlayersListFile(testplayersList);
	}
	public void testSignUpScout(String scoutName, String team, int scoutId, String userName, String password)
	{	
		user U = new scout(scoutName, team, scoutId, userName,password);
		testUserList.add(U);
		testWriteToUserListFile(testUserList);

	}
	
	public void testWriteToUserListFile(List<user> testUserList) {
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME2)))
		{
			objectOutputStream.writeObject(testUserList);
			objectOutputStream.flush();
			objectOutputStream.close();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void testReadUsersFile(){
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME2))) 
		  {
			testUserList = (ArrayList<user>) input.readObject();
			  input.close();
		  }
		catch (Exception e) 
		  {
			testUserList = new ArrayList<user>();
		  }
	}

	public void testWriteToPlayersListFile(ArrayList<player> testplayersList) {
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME1)))
		{
			objectOutputStream.writeObject(testplayersList);
			objectOutputStream.flush();
			objectOutputStream.close();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	public void testReadPlayersFile(){
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME1))) 
		  {
			testplayersList = (ArrayList<player>) input.readObject();
			  input.close();
		  }
		catch (Exception e) 
		  {
			testplayersList = new ArrayList<player>();
		  }
	}
	
}
