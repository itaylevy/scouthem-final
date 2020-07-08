package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.game;
import model.player;
import view.PlayerScreen;
import view.addGame;

public class GameController {
	private addGame theView;
	private player theModel;
	
	public GameController(addGame theView, player theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
	        this.theView.addAddGameListner(new addAddGameListner());
	        this.theView.addBackButtonListner(new backButtonListner());

	    }
	class addAddGameListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   int goalsCount = theView.getGoalsCount();
			   int numOfAssists = theView.getAssistsCount();
			   int totalPlayingTime = theView.gettotalPlayingTimeValue();
			   int redCard = theView.getRedCardCount();
			   int yellowCard = theView.getYellowCardCount();
			   game gameToAdd = new game("10.10.2020", yellowCard, redCard, totalPlayingTime, "Maccabi" ,numOfAssists,
						goalsCount);
			   theModel.addGame(gameToAdd);
			   theView.setVisible(false);
			   PlayerScreen playerScreen = new PlayerScreen((player) theModel);
			   playerScreen.setVisible(true);
			   PlayerController playersControl = new PlayerController(playerScreen, (player) theModel);
		   }
	}
	class backButtonListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   System.out.println("GameController: Back button action listner");
			   theView.setVisible(false);
			   PlayerScreen playerScreen = new PlayerScreen((player) theModel);
			   playerScreen.setVisible(true);
			   PlayerController playersControl = new PlayerController(playerScreen, (player) theModel);
		   }
	}
}
