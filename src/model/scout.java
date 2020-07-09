package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class scout extends user implements Serializable{
	
	private final String FILENAME = "players.txt";
	private final String FILENAME1 = "InterestList";
	
	private String scoutName;
	private int scoutId;
	private team MyTeam;
	private ArrayList<player> players;
	private ArrayList<player> InterestList;
	/////////////////////////////////////
	
	public scout(String scoutName, String team, int scoutId, String userName, String password) {
		super(userName, password);
		this.scoutName = scoutName;
		this.scoutId=scoutId;
		MyTeam =new team(team);
		InterestList = new ArrayList<player>();
	}
	public scout() {
		
	}
	////////////////////////////////////
	
	public String getScoutName() {
		return scoutName;
	}
	public void setScoutName(String scoutName) {
		this.scoutName = scoutName;
	}
	public int getScoutId() {
		return scoutId;
	}
	public void setScoutId(int scoutId) {
		this.scoutId = scoutId;
	}
	public team getMyTeam() {
		return MyTeam;
	}
	public void setMyTeam(team myTeam) {
		MyTeam = myTeam;
	}
	public List<player> getInterestList() {
		readInterestingPlayerFile();
		return InterestList;
	}
	public void setInterestList(ArrayList<player> InterestList) {
		this.InterestList = InterestList;
	}
	public ArrayList<player> getPlayers() {
		readPlayersFile();
		return players;
	}
	public void setPlayers(ArrayList<player> players) {
		this.players = players;
	}
	///////////////////////////////////
	
	@Override
	public String toString() {
		return  "Username:" + this.getUserName() + "\n" +
				"Password:" + this.getPassword() + "\n" +
				"scout - [scoutName = " + scoutName  + ", team = " +  MyTeam.getTeamName() + "]" + "." + "\n" + "\n";
	}
	
	public void addInterestingPlayer(int idPlayer)
	{
		// FILENAME = player.txt
		// FILENAME1 = InterestListscoutId.txt
		readPlayersFile();
		readInterestingPlayerFile();
		System.out.print("Inside add player");
		for(int i=0; i<players.size(); i++) {
			if(players.get(i).getIdPlayer() == idPlayer) {
				InterestList.add(players.get(i));
				System.out.print("Found");
				break;
			}
		}
		writeToInterestListPlayersFile(InterestList);
	}
	public void removeInterestingPlayer(int idPlayer)
	{
		// FILENAME1 = InterestListscoutId.txt
		readInterestingPlayerFile();
		
		for(int i=0; i<InterestList.size(); i++)
		{
			if(InterestList.get(i).getIdPlayer() == idPlayer) {
				InterestList.remove(i);	
				}
		}
		
		writeToInterestListPlayersFile(InterestList);
	}
	
	public void readPlayersFile() {
		// FILENAME = player.txt
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME))) 
		  {
			players = (ArrayList<player>) input.readObject();
		  } 
		  catch (Exception e) 
		  {
			  players = new ArrayList<player>();
		  }	
	}
	public void readInterestingPlayerFile() {
		// FILENAME1 = InterestListscoutId.txt
		String fileName = FILENAME1 +  this.scoutId + ".txt";
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) 
		  {
			InterestList = new ArrayList<player>();
			InterestList = (ArrayList<player>) input.readObject();
		  } 
		  catch (Exception e) 
		  {
			  InterestList = new ArrayList<player>();
		  }	
	}

	public void writeToInterestListPlayersFile(List<player> InterestList)
	{
		// FILENAME1 = InterestListscoutId.txt
		String fileName = FILENAME1 +  this.scoutId + ".txt";
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
			objectOutputStream.writeObject(InterestList);
			objectOutputStream.flush();
			objectOutputStream.close();
		}catch(IOException e) {
			e.printStackTrace();		
		}
	}

}
