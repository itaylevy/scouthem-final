package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.userList;
import view.LoginView;

public class LoginController {
	private LoginView theView;
	private userList theModel;
	
    public LoginController(LoginView theView, userList theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addLoginListner(new LoginListener());

    }
    
	class LoginListener implements ActionListener{
	
	    public void actionPerformed(ActionEvent e) {
            String userName = theView.getUserName();
            String password = theView.getPassword();
            theView.setLoginMessage(theModel.login(userName, password));
		}
	}
}