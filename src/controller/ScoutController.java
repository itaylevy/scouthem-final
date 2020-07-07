package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import model.player;
import model.scout;
import model.userList;
import view.LoginView;
import view.ScoutScreen;

public class ScoutController {
	private ScoutScreen theView;
	private scout theModel;
	private userList userList;
	
	public ScoutController(ScoutScreen theView, scout theModel, userList users) {
	        this.theView = theView;
	        this.theModel = theModel;
	        userList = users;
	        this.theView.addSignOutListener(new signOutButtonListner());
	        this.theView.addFindPlayersListener(new findPlayersListner());
	        this.theView.addShowPlayersListener(new showPlayersListner());
	        this.theView.addAddPlayerListener(new addPlayerListner());
	        this.theView.addRemovePlayerListener(new removePlayerListner());

	    }
	class removePlayerListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	int row = theView.getSelectedRowInInterestTable();
			   	Object id = theView.getValueFromInterestTable(row, 2);
			   	theModel.removeInterestingPlayer((int) id);
		   }
	}
	class addPlayerListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	int row = theView.getSelectedRowInFindPlayersTable();
			   	Object id = theView.getValueFromFindPlayersTable(row, 6);
			   	theModel.addInterestingPlayer((int) id);
			   	System.out.print(id); 
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
