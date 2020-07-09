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
	        this.theView.addFilterByTeamListener(new filterByTeamListner());
	        this.theView.addFilterByRoleListener(new filterByRoleListner());
	        this.theView.addSortByAssistsListener(new sortByAssistsListner());
	        this.theView.addSortByPlayingTimeListener(new sortByPlayingTimeListner());
	}
	class filterByTeamListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   player_List players = new player_List();
			   String teamName = theView.getTeamName();
			   player[] listOfPlayers = null;
			   if (teamName.equals("Team") ) 
			   {
				   theView.setMessage("Enter valid team name");
			   }
			   else 
			   {
				   listOfPlayers = players.sortByString("team", teamName);
			   }
			   if (listOfPlayers != null) {
				   theView.initFindPlayersTable();
				   theView.showFindPlayersTable();
					for (player i: listOfPlayers) 
					{
						if(i != null)
						{
							theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getYellowCard(), i.getRedCard(), i.getAge(), i.getIdPlayer());
				   		
						}
				   	}
			   }
		   }
	}
	class filterByRoleListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   player_List players = new player_List();
			   String role = theView.getPlayerRole();
			   player[] listOfPlayers = null;
			   listOfPlayers = players.sortByString("role", role);
			   if (listOfPlayers != null) 
			   {
				   theView.initFindPlayersTable();
				   theView.showFindPlayersTable();
					for (player i: listOfPlayers) 
					{
						if(i != null)
						{
							theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getYellowCard(), i.getRedCard(), i.getAge(), i.getIdPlayer());
				   		
						}
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
			   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getYellowCard(), i.getRedCard(), i.getAge(), i.getIdPlayer());
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
			   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getYellowCard(), i.getRedCard(), i.getAge(), i.getIdPlayer());
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
			   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getYellowCard(), i.getRedCard(), i.getAge(), i.getIdPlayer());
			   	}
			   
		   }
	}
	class removePlayerListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	int row = theView.getSelectedRowInInterestTable();
			   	Object id = theView.getValueFromInterestTable(row, 9);
			   	theModel.removeInterestingPlayer((int) id);
			   	theView.initInterestTable();
			   	theView.showInterestTable();
			   	List<player> InterestList = theModel.getInterestList();
			   	for (player i: InterestList) {
			   		theView.addItemToInterestTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getYellowCard(), i.getRedCard(), i.getAge(), i.getIdPlayer());
			   	}
			   	theView.setMessage("Player removed");
		   }
	}
	class addPlayerListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	int row = theView.getSelectedRowInFindPlayersTable();
			   	Object id = theView.getValueFromFindPlayersTable(row, 9);
			   	theModel.addInterestingPlayer((int) id);
			   	theView.setMessage("Player added");
		   }
	}
	class signOutButtonListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   System.out.println("ScoutController: Sign out action listner");
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
			   	ArrayList<player> findPlayersList = theModel.getPlayers();
			   	
			   	for (player i: findPlayersList) {
			   		theView.addItemToFindPlayersTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getYellowCard(), i.getRedCard(), i.getAge(), i.getIdPlayer());
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
			   	if (InterestList.isEmpty())
			   	{
			   		theView.setMessage("Interest list is empty");
			   	}
			   	for (player i: InterestList) {
			   		theView.addItemToInterestTable(i.getPlayerName(), i.getMyTeam().getTeamName(), i.getRole(), i.getGoals(), i.getNumOfAssists(), i.getTotalPlayingTime(), i.getYellowCard(), i.getRedCard(), i.getAge(), i.getIdPlayer());
			   	}
		   }
	}
	
}
