package model;

import java.util.HashSet;
import java.util.Set;

public class player_List {

	protected Set<player> listPlayer = new HashSet<player>();
	/////////////////////////////////////////
	
	public player_List() {

	}
	
	public player_List(player p1) {
		super();
		this.listPlayer.add(p1);
	}
	////////////////////////////////////////
	
	public Set<player> getListPlayer() {
		return listPlayer;
	}
	public void setListPlayer(Set<player> listPlayer) {
		this.listPlayer = listPlayer;
	}
	/////////////////////////////////////////
	
	public boolean addplayer(player p)
	{
		return listPlayer.add(p);		
	}
	public Set<player> sortByNumOfAssists(int numOfAssists)
	{
		
		return listPlayer;
		
	}
	public Set<player> sortByNumOfGoals(int goals)
	{
		return listPlayer;
		
	}
	public Set<player> sortByRole(String role)
	{
		return listPlayer;
		
	}
	public Set<player> sortByTotalPlayingTime(int totalPlayingTime)
	{
		return listPlayer;
		
	}

}
