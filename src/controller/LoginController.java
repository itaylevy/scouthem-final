package controller;

import java.awt.event.ActionListener;

import javax.swing.text.View;

import java.awt.event.ActionEvent;

import model.player;
import model.scout;
import model.user;
import model.userList;
import view.LoginView;
import view.PlayerScreen;
import view.ScoutScreen;
import view.SignUp;

public class LoginController {
	private LoginView theView;
	private userList theModel;
	
    public LoginController(LoginView theView, userList theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addLoginListner(new LoginListener());
        this.theView.addSignUpListner(new signUpListener());

    }
    
	class LoginListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
            String userName = theView.getUserName();
            String password = theView.getPassword();
            user myUser = null;
            myUser = theModel.login(userName, password);
            if (myUser instanceof player) 
            {
            	PlayerScreen playerScreen = new PlayerScreen((player) myUser);
            	PlayerController playersControl = new PlayerController(playerScreen, (player) myUser);
            	theView.setVisible(false);
            	playerScreen.setVisible(true);
    		}
    		else if (myUser instanceof scout) 
    		{
    			ScoutScreen newView= new ScoutScreen((scout) myUser);
    			theView.setVisible(false);
    			newView.setVisible(true);
    			ScoutController scoutControl = new ScoutController(newView, (scout) myUser, theModel);
    		}
    		else 
    		{
              theView.setLoginMessage();
    		}
		}
	}
	class signUpListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	    	System.out.println("LoginController: Sign up action listner");
            SignUp newView = new SignUp();
			SignUpController signUpControl = new SignUpController(newView,theModel);
			theView.setVisible(false);
		    newView.setVisible(true);
		}
	}
}