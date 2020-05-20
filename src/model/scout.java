package model;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

public class scout extends team{
	
	private String scoutName;
	private String password;
	private int scoutId;
	private Set<scout> setOfScouters = new HashSet<scout>();
	private LinkedList<player> InterestList = new LinkedList<player>();
	/////////////////////////////////////תכונות
	
	public scout() {
	
	}
	public scout(String scoutName, String team, String password, int scoutId, LinkedList<player> InterestList) {
		super(team);
		this.scoutName = scoutName;
		this.password=password;
		this.scoutId=scoutId;
		this.InterestList = null;
	}
	////////////////////////////////////set&get
	
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
	
	///////////////////////////////////פונקציות
	@Override
	public String toString() {
		return "scout - [scoutName=" + scoutName  + ", team =" +  getTeamName() + "." + "\n" + "\n";
	}
	public player getPlayerInformatin()
	{
		
		return null;
		
	}
	public void addPlayer(player p)
	{
		
	}
	public void addScout(scout s)
	{
		this.setOfScouters.add(s);
	}
	public void removePlayer(int idPlayer)
	{
		
	}
    public LinkedList<player>showInterestList() {
		return InterestList;
		}


}
