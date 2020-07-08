package controller;

import java.io.IOException;

import model.scout;
import model.user;
import model.userList;
import view.LoginView;
public class MVCCLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		LoginView theView = new LoginView();
		userList theModel = new userList();
    	LoginController theController = new LoginController(theView,theModel);
        theView.setVisible(true);

	}

}
