package controller;

import java.awt.event.ActionListener;

import javax.swing.text.View;

import java.awt.event.ActionEvent;

import model.Player;
import model.Scout;
import model.User;
import model.UserList;
import view.SignInScreen;
import view.PlayerScreen;
import view.ScoutScreen;
import view.SignUpScreen;

public class SignInController {
	private SignInScreen theView;
	private UserList theModel;
	
    public SignInController(SignInScreen theView, UserList theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addLoginListner(new LoginListener());
        this.theView.addSignUpListner(new signUpListener());

    }
    
	class LoginListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
            String userName = theView.getUserName();
            String password = theView.getPassword();
            User myUser = null;
            myUser = theModel.login(userName, password);
            if (myUser instanceof Player) 
            {
            	PlayerScreen playerScreen = new PlayerScreen((Player) myUser);
            	PlayerController playersControl = new PlayerController(playerScreen, (Player) myUser);
            	theView.setVisible(false);
            	playerScreen.setVisible(true);
    		}
    		else if (myUser instanceof Scout) 
    		{
    			ScoutScreen newView= new ScoutScreen((Scout) myUser);
    			theView.setVisible(false);
    			newView.setVisible(true);
    			ScoutController scoutControl = new ScoutController(newView, (Scout) myUser, theModel);
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
            SignUpScreen newView = new SignUpScreen();
			SignUpController signUpControl = new SignUpController(newView,theModel);
			theView.setVisible(false);
		    newView.setVisible(true);
		}
	}
}