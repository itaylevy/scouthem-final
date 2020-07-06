package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.player;
import model.userList;
import view.LoginView;
import view.PlayerScreen;
import view.addGame;

public class PlayerController {

	private PlayerScreen theView;
	private player theModel;
	
	public PlayerController(PlayerScreen theView, player theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
	        this.theView.addGameListener(new addGameListener());
	        this.theView.addSignOutListener(new signOutButtonListner());

	    }
	class addGameListener implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	theView.setVisible(false);
	            addGame newView = new addGame(theModel);
	            GameController gameControl = new GameController(newView,theModel);
	            newView.setVisible(true);
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
}