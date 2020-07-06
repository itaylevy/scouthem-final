package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.userList;
import view.LoginView;
import view.SignUp;

public class SignUpController {
	private SignUp theView;
	private userList theModel;
	
	public SignUpController(SignUp theView, userList theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
	        this.theView.addSignUpActionListner(new signUpActionListner());
	        this.theView.addSignInActionListner(new signInActionListner());

	    }
	class signUpActionListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   String userType = theView.getUserType();
			   String userName = theView.getUserName();
			   String password = theView.getPassword();
			   if (userType == "Player") {
				   String playerName = theView.getPlayerName();
				   int playerId = theView.getPlayerId();
				   int playerAge = theView.getPlayerAge();
				   int playerWeight = theView.getPlayerWeight();
				   int playerHeight = theView.getPlayerHeight();
				   String playerTeam = theView.getPlayerTeamName();
				   String playerRole = theView.getPlayerRole();
				   theModel.signUpPlayer(playerName, playerTeam, playerRole, playerAge, playerHeight, playerWeight, "w@c.com", playerId, userName, password);

			   }
			   else if (userType == "Scout") {
				   String scoutName = theView.getScoutName();
				   int scoutId = theView.getScoutId();
				   String scoutTeam = theView.getScoutTeamName();
				   theModel.signUpScout(scoutName, scoutTeam, scoutId, userName, password);
			   }
			   theView.setVisible(false);
			   LoginView newView = new LoginView();
			   userList newModel = new userList();
			   LoginController theController = new LoginController(newView,newModel);
		       newView.setVisible(true);
		   }
	}
	class signInActionListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   theView.setVisible(false);
			   LoginView newView = new LoginView();
			   userList newModel = new userList();
			   LoginController theController = new LoginController(newView,newModel);
		       newView.setVisible(true);
		   }
	}
}
