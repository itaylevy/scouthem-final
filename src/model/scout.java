package model;

import java.util.LinkedList;

public class scout extends user{
	
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
	public scout(String userName, String password)
	{
		super(userName, password);	
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
	public player getPlayerInformatin(player p)
	{
		
		return p;
		
	}
	public void addPlayer(player p)
	{
		this.InterestList.add(p);
		System.out.println("player - " +  p.getPlayerName() + " added to the list");
	}
	public void removePlayer(player p)
	{
		InterestList.remove(p);
		System.out.println("player - " +  p.getPlayerName() + " remove from the list");
		
	}
    public LinkedList<player>showInterestList() {
		return InterestList;
		}
//	@Override
//	public scout getType() {
//		return this;
//	}

}
