package controller;

import model.userList;
import view.LoginView;
public class MVCCLogin {

	public static void main(String[] args) {
		LoginView theView = new LoginView();
		userList theModel = new userList();
    	LoginController theController = new LoginController(theView,theModel);
        theView.setVisible(true);

	}

}
