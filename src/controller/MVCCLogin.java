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
		int id = 1234;
		theModel.signUpPlayer("AVIf" , "Maccabi", "Goalkeeper", 15, 1.83, 76.5, "mor@gmail.com", id, "avif", "1234");
		theModel.signUpPlayer("NAOR" , "Hapoel", "Sweeper", 15, 1.83, 76.5, "mor@gmail.com", 123456789, "naor", "1234");
		user U = new scout("Itay", "Hapoel tel aviv", 200343846, "itay", "1");
		scout me = (scout) U;
		me.addInterestingPlayer(id);
		theModel.addUser(U);
    	LoginController theController = new LoginController(theView,theModel);
        theView.setVisible(true);

	}

}
