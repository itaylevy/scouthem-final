package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
			   boolean flag = false;
			   String messageToDisplay = "";
			   String userType = theView.getUserType();
			   String userName = theView.getUserName();
			   if (isValidUsername(userName)) {
				   String password = theView.getPassword();
				   if (!password.equals( "Enter Password") && !password.equals("") && !password.contains(" ")) {
					   if (userType == "Player") {
						   String playerName = theView.getPlayerName();
						   if (!playerName.equals("") && !playerName.equals("Enter Name")) {
							   String playerId = theView.getPlayerId();
							   if (!playerId.isEmpty() && !playerId.equals("ID Number")) {
								   int playerAge = theView.getPlayerAge();
								   int playerWeight = theView.getPlayerWeight();
								   int playerHeight = theView.getPlayerHeight();
								   String playerTeam = theView.getPlayerTeamName();
								   if (!playerTeam.equals("") && !playerTeam.equals("Enter Team name")) 
								   {
									   String playerRole = theView.getPlayerRole();
									   String playerEmail = theView.getPlayerEmail();
									   if (isValidEmail(playerEmail)) 
									   {
										   theModel.signUpPlayer(playerName, playerTeam, playerRole, playerAge, playerHeight, playerWeight, playerEmail, Integer.parseInt(playerId), userName, password);
										   flag = true;   
									   }
									   else 
									   {
										   messageToDisplay = "Player's Email is invalid";
									   }
								   }
								   else 
								   {
									   messageToDisplay = "Player's team name is invalid";

								   }
							   }
							   else 
							   {
								   messageToDisplay = "Player's ID is invalid";
							   }
						   }
						   else
						   {
							   messageToDisplay = "Player's Name is invalid";
						   }
					   }
					   else if (userType == "Scout") {
						   String scoutName = theView.getScoutName();
						   if (!scoutName.equals("") && !scoutName.equals("Enter Name")) 
						   {
							   String scoutId = theView.getScoutId();
							   if (!scoutId.isEmpty() && !scoutId.equals("ID Number")) 
							   {
								   String scoutTeam = theView.getScoutTeamName();
								   if(!scoutTeam.equals("") && !scoutTeam.equals("Enter Team name")) 
								   {
									   theModel.signUpScout(scoutName, scoutTeam, Integer.parseInt(scoutId), userName, password);
									   flag = true;
								   }
								   else 
								   {
									   messageToDisplay = "Scout's team name is invalid";
								   }
								   
							   }
							   else {
								   messageToDisplay = "Scout's ID is invalid";
							   }
						   }
						   else {
							   messageToDisplay = "Scout's Name is invalid";

						   }
					   }
					   else {
						   messageToDisplay = "Please select User type";
					   }
				   }
				   else {
					   messageToDisplay = "Password is invalid";
				   }
				   
			   }
			   else {
				   messageToDisplay = "Username is invalid";
			   }
		       if (flag == true) {
		    	   theView.setVisible(false);
				   LoginView newView = new LoginView();
				   userList newModel = new userList();
				   LoginController theController = new LoginController(newView,newModel);
			       newView.setVisible(true);
		       }
		       else
		       {
		    	   theView.setErrorMessage(messageToDisplay);
		       }
		   }
		   public boolean isValidUsername(String name) 
		    { 
		  		String regex = "^[aA-zZ]\\w{2,29}$"; 
		        Pattern p = Pattern.compile(regex); 
		        if (name == null) { 
		            return false; 
		        } 
		        Matcher m = p.matcher(name);  
		        return m.matches(); 
		    }
		   public boolean isValidEmail(String mail) 
		    { 
		  		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; 
		        Pattern p = Pattern.compile(regex); 
		        if (mail == null) { 
		            return false; 
		        } 
		        Matcher m = p.matcher(mail);  
		        return m.matches(); 
		    }
	}
	class signInActionListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   theView.setVisible(false);
			   LoginView newView = new LoginView();
			   LoginController theController = new LoginController(newView,theModel);
		       newView.setVisible(true);
		   }
	}
}

