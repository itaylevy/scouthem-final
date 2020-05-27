package model;

import java.util.LinkedList;
import java.util.Comparator;

public class player_List implements Comparator<player>{
	
	protected LinkedList<player> listPlayer= new LinkedList<player>();
	protected LinkedList<player> sotrlistPlayer= new LinkedList<player>();
	/////////////////////////////////////////
	
	public player_List() {
	}
	
	
	/////////////////////////////////////////
	
	public LinkedList<player> getListPlayer() {
		return listPlayer;
	}
	public void setListPlayer(LinkedList<player> listPlayer) {
		this.listPlayer = listPlayer;
	}
	/////////////////////////////////////////
	
	public LinkedList<player> showListPlayer() {
		return listPlayer;
	}
	public void addplayer(player p)
	{
		 listPlayer.add(p);	
	}
	
	
	public void sortByNumOfAssists() {
		listPlayer.sort(new player_List());
	}
	public void sortByNumOfGoals() {
		listPlayer.sort(new player_List());		
	}
	public void sortByRole() {
		listPlayer.sort(new player_List());
	}
	public void sortByTotalPlayingTime() {
		listPlayer.sort(new player_List());
	}

	public int compareByGoals(player p1, player p2) {

		return p2.getGoals()-p1.getGoals();
	
	}
	
	@Override
	public int compare(player p1, player p2) {

		return p2.getGoals()-p1.getGoals();
	
	}






	

}
