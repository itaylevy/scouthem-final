package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class scout extends user implements Serializable{
	
	private final String FILENAME = "InterestList";
	
	private String scoutName;
	private int scoutId;
	private team MyTeam;
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
		String fileName = FILENAME +  this.scoutId + ".txt";
		readInterestPlayersFile(fileName);
		return InterestList;
	}
	public void setInterestList(ArrayList<player> InterestList) {
		this.InterestList = InterestList;
	}
	///////////////////////////////////
	
	@Override
	public String toString() {
		return  "scout - [scoutName = " + scoutName  + ", team = " +  MyTeam.getTeamName() + "]" + "." + "\n" + "\n";
	}
	public void addInterestingPlayer(player p)
	{
		String fileName = FILENAME +  this.scoutId + ".txt";
		readInterestPlayersFile(fileName);
		InterestList.add(p);
		writeToInterestListPlayersFile(InterestList);
	}
	public void removeInterestingPlayer(player p)
	{
		String fileName = FILENAME +  this.scoutId + ".txt";
		readInterestPlayersFile(fileName);
		
		for(int i=0; i<InterestList.size(); i++)
		{
			if(InterestList.get(i).getIdPlayer() == p.getIdPlayer()) {
				InterestList.remove(i);	
				}
		}
		
		writeToInterestListPlayersFile(InterestList);
	}
	
	public void readInterestPlayersFile(String fileName) {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) 
		  {
			InterestList = (ArrayList<player>) input.readObject();
		  } 
		  catch (Exception e) 
		  {
			  InterestList = new ArrayList<player>();
		  }	
	}
	public void writeToInterestListPlayersFile(List<player> InterestList)
	{
		String fileName = FILENAME +  this.scoutId + ".txt";
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))){
			objectOutputStream.writeObject(InterestList);
			objectOutputStream.flush();
			objectOutputStream.close();
		}catch(IOException e) {
			e.printStackTrace();		
		}
	}
}
