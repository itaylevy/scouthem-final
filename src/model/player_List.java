package model;

import java.util.LinkedList;


public class player_List {

	public LinkedList<player> listPlayer= new LinkedList<player>();
	/////////////////////////////////////////
	
	public player_List() {
	}
	
	/////////////////////////////////////////
	
	public void addplayer(player p)
	{
		 listPlayer.add(p);	
	}
	public LinkedList<player> sortByNumOfAssists()
	{	
		
		return listPlayer;
		
	}
	public LinkedList<player> sortByNumOfGoals(int goals)
	{
		return listPlayer;
		
	}
	public LinkedList<player> sortByRole(String role)
	{
		return listPlayer;
		
	}
	public LinkedList<player> sortByTotalPlayingTime(int totalPlayingTime)
	{
		return listPlayer;
		
	}
	public LinkedList<player> showListPlayer() {
		return listPlayer;
	}

}
