package model;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

public class scout extends player_List{
	
	private String scoutName;
	private String password;
	private int scoutId;
	private team MyTeam;
	private Set<scout> setOfScouters = new HashSet<scout>();
	private LinkedList<player> InterestList = new LinkedList<player>();
	/////////////////////////////////////
	
	public scout() {
	
	}
	public scout(String scoutName, String team, String password, int scoutId) {
		super();
		this.scoutName = scoutName;
		this.password=password;
		this.scoutId=scoutId;
		MyTeam =new team(team);
	}
	////////////////////////////////////
	
	public String getScoutName() {
		return scoutName;
	}
	public void setScoutName(String scoutName) {
		this.scoutName = scoutName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getScoutId() {
		return scoutId;
	}
	public void setScoutId(int scoutId) {
		this.scoutId = scoutId;
	}
	public Set<scout> getSetOfScouters() {
		return setOfScouters;
	}
	public void setSetOfScouters(Set<scout> setOfScouters) {
		this.setOfScouters = setOfScouters;
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
		return  "scout - [scoutName = " + scoutName  + ", team = " +  MyTeam.getTeamName() + "." + "\n" + "\n";
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
	public void addScout(scout s)
	{
		this.setOfScouters.add(s);
	}
	public void removePlayer(player p)
	{
		InterestList.remove(p);
		System.out.println("player - " +  p.getPlayerName() + " remove from the list");
		
	}
    public LinkedList<player>showInterestList() {
		return InterestList;
		}
}
