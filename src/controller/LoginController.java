package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import model.userList;
import view.LoginView;

public class LoginController<T> {
	private LoginView theView;
	private userList<T> theModel;
	
    public LoginController(LoginView theView, userList<T> theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addLoginListener(new LoginListener());

    }
    
	class LoginListener implements ActionListener{
	
	    public void actionPerformed(ActionEvent e) {
	 	   
	        String userName=null;
	        char[] password=null;
	
	      
	            userName = theView.getUserName();
	            password = theView.getPassword();
	             
	           theView.setLoginMessage(theModel.login(userName, password));
		}
	}
}