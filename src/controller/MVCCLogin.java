package controller;

import java.io.IOException;

import model.player;
import model.scout;
import model.user;
import model.userList;
import view.LoginView;
public class MVCCLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		LoginView theView = new LoginView();
		userList theModel = new userList();
		user P = new player("moro" , "Maccabi Tel Aviv", "center beack", 15, 1.83, 76.5, "mor@gmail.com", 1234, "moro", "1234");
		user S = new player("nivo" , "Maccabi Haifa", "center beack", 15, 1.83, 76.5, "mor@gmail.com", 123456789, "nivo", "1234");
		theModel.addUser(P);
		theModel.addUser(S);
		user U = new scout("Nisso", "Hapoel tel aviv", 987654321, "Nisso", "1234");
		scout me = (scout) U;
		me.addInterestingPlayer(1234);
		theModel.addUser(U);
    	LoginController theController = new LoginController(theView,theModel);
        theView.setVisible(true);

	}

}
