package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.LoginController.LoginListener;
import model.player;
import model.userList;
import view.LoginView;
import view.PlayerScreen;

public class PlayerController {

	private PlayerScreen theView;
	private player theModel;
	
	public PlayerController(PlayerScreen theView, player theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
	        this.theView.addGameListener(new LoginListener());

	    }
	class addGameListener implements ActionListener{
		   public void actionPerformed(ActionEvent e) {
	            String date = theView.getdate;
	        	int yellowCard = theView.getYellowCard;
	        	int redCard = theView.getRedCard;
	        	int playTimeGame = theView.getTimeGame;
	        	String rivalTeam = theView.getRivalTeam;
	        	int numOfAssists = theView.getNumOfAssists;
	            int goalsNum = theView.getNumOfGoals();

	        	theView.setGameInfo(theModel.addGame(date,yellowCard,redCard,playTimeGame,rivalTeam,numOfAssists,goalsNum));
	}
}
}