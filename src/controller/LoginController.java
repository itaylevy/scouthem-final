package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.player;
import model.scout;
import model.user;
import model.userList;
import view.LoginView;
import view.PlayerScreen;
import view.ScoutScreen;
import view.signUp;

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
            user myUser = theModel.login(userName, password);
            if (myUser instanceof player) {
            	theView.setVisible(false);
            	PlayerScreen playerScreen = new PlayerScreen((player) myUser);
            	playerScreen.setVisible(true);
            	PlayerController playersControl = new PlayerController(playerScreen, (player) myUser);
//    			
    		}
    		else if (myUser instanceof scout) {
//    			this.setVisible(false);
//    			new ScoutScreen((scout) user).setVisible(true);
    		}
    		else {
              theView.setLoginMessage();
    		}
		}
	}
	class signUpListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
            theView.setWindowVisible(false);
            new signUp().setVisible(true);
		}
	}
}