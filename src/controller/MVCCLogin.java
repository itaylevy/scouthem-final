package controller;

import java.io.IOException;

import model.Scout;
import model.User;
import model.UserList;
import view.SignInScreen;
public class MVCCLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		SignInScreen theView = new SignInScreen();
		UserList theModel = new UserList();
    	SignInController theController = new SignInController(theView,theModel);
        theView.setVisible(true);
	}

}
