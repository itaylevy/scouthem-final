package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Set;

public class scout extends user implements Serializable{
	
	private final String FILENAME = "InterestList";
	
	private String scoutName;
	private int scoutId;
	private team MyTeam;
	private LinkedList<player> InterestList = new LinkedList<player>();
	/////////////////////////////////////
	
	public scout(String scoutName, String team, int scoutId, String userName, String password) {
		super(userName, password);
		this.scoutName = scoutName;
		this.scoutId=scoutId;
		MyTeam =new team(team);
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
	public LinkedList<player> getInterestList() {
		return InterestList;
	}
	public void setInterestList(LinkedList<player> InterestList) {
		this.InterestList = InterestList;
	}
	///////////////////////////////////
	
	@Override
	public String toString() {
		return  "scout - [scoutName = " + scoutName  + ", team = " +  MyTeam.getTeamName() + "]" + "." + "\n" + "\n";
	}
	public void addInterestingPlayer(player p)
	{
		InterestList.add(p);
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILENAME))){
			objectOutputStream.writeObject(InterestList);
		}catch(IOException e) {
			e.printStackTrace();		
		}
		System.out.println("player - " +  p.getPlayerName() + " added to the list");
	}
	public void removeInterestingPlayer(player p)
	{
		InterestList.remove(p);
		System.out.println("player - " +  p.getPlayerName() + " remove from the list");
	}
    public LinkedList<player>showInterestList() {
    
		if(InterestList.isEmpty())
		{
			return null;
		}
		
		  try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME))) {
			  InterestList = (LinkedList<player>) input.readObject();
		  } catch (Exception e) {
			     e.printStackTrace();
			  }		
		return InterestList;
		}
}
