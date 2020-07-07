package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import model.player;
import model.player_List;
import model.scout;
import model.userList;
import view.LoginView;
import view.ScoutScreen;

public class ScoutController {
	private ScoutScreen theView;
	private scout theModel;
	private userList userList;
	
	public ScoutController(ScoutScreen theView, scout theModel, userList users) 
	{
	        this.theView = theView;
	        this.theModel = theModel;
	        userList = users;
	        this.theView.addSignOutListener(new signOutButtonListner());
	        this.theView.addFindPlayersListener(new findPlayersListner());
	        this.theView.addShowPlayersListener(new showPlayersListner());
	        this.theView.addAddPlayerListener(new addPlayerListner());
	        this.theView.addRemovePlayerListener(new removePlayerListner());
	        this.theView.addSortByGoalsListener(new sortByGoalsListner());
	        this.theView.addFilterByTeamOrRoleListener(new filterByTeamOrRoleListner());
	        this.theView.addSortByAssistsListener(new sortByAssistsListner());
	        this.theView.addSortByPlayingTimeListener(new sortByPlayingTimeListner());
	}
	class filterByTeamOrRoleListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   player_List players = new player_List();
			   String teamName = theView.getTeamName();
			   String role = theView.getPlayerRole();
			   player[] listOfPlayers = null;
			   if (teamName.equals("Team")) 
			   {
				   listOfPlayers = players.sortByString("role", role);
			   }
			   else 
			   {
				   listOfPlayers = players.sortByString("team", teamName);
			   }
			   if (listOfPlayers != null) {
				   theView.initFindPlayersTable();
				   	theView.showFindPlayersTable();
					for (player i: listOfPlayers) {
				   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getIdPlayer());
				   	}
			   }
		   }
	}
	class sortByPlayingTimeListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   player_List players = new player_List();
			   player[] listOfPlayers = players.SortByInt("playing time");
			   	theView.initFindPlayersTable();
			   	theView.showFindPlayersTable();
			   	for (player i: listOfPlayers) {
			   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getIdPlayer());
			   	}
			   
		   }
	}
	class sortByAssistsListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   player_List players = new player_List();
			   player[] listOfPlayers = players.SortByInt("assists");
			   	theView.initFindPlayersTable();
			   	theView.showFindPlayersTable();
			   	for (player i: listOfPlayers) {
			   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getIdPlayer());
			   	}
			   
		   }
	}
	class sortByGoalsListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   player_List players = new player_List();
			   player[] listOfPlayers = players.SortByInt("goal");
			   	theView.initFindPlayersTable();
			   	theView.showFindPlayersTable();
			   	for (player i: listOfPlayers) {
			   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getIdPlayer());
			   	}
			   
		   }
	}
	class removePlayerListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	int row = theView.getSelectedRowInInterestTable();
			   	Object id = theView.getValueFromInterestTable(row, 2);
			   	theModel.removeInterestingPlayer((int) id);
			   	theView.initInterestTable();
			   	theView.showInterestTable();
			   	List<player> InterestList = theModel.getInterestList();
			   	for (player i: InterestList) {
			   		theView.addItemToInterestTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getIdPlayer());
			   	}
		   }
	}
	class addPlayerListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	int row = theView.getSelectedRowInFindPlayersTable();
			   	Object id = theView.getValueFromFindPlayersTable(row, 6);
			   	theModel.addInterestingPlayer((int) id);
		   }
	}
	class signOutButtonListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	LoginView newView = new LoginView();
				userList newModel = new userList();
		    	LoginController theController = new LoginController(newView,newModel);
		        theView.setVisible(false);
		        newView.setVisible(true);
		   }
	}
	class findPlayersListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	theView.initFindPlayersTable();
			   	theView.showFindPlayersTable();
			   	List<player> findPlayersList = theModel.getPlayers();
			   	for (player i: findPlayersList) {
			   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getIdPlayer());
			   	}
		   }
	}
	class showPlayersListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	theView.initInterestTable();
			   	theView.showInterestTable();
			   	List<player> InterestList = theModel.getInterestList();
			   	for (player i: InterestList) {
			   		theView.addItemToInterestTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getIdPlayer());
			   	}
		   }
	}
	
}
