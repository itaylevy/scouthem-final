package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.LoginController.LoginListener;
import controller.PlayerController.signOutButtonListner;
import model.scout;
import model.userList;
import view.LoginView;
import view.ScoutScreen;

public class ScoutController {
	private ScoutScreen theView;
	private scout theModel;
	
	public ScoutController(ScoutScreen theView, scout theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
	        this.theView.addSignOutListener(new signOutButtonListner());

	    }
	class signOutButtonListner implements ActionListener
	{
		   public void actionPerformed(ActionEvent e) 
		   {
			   	LoginView newView = new LoginView();
				userList newModel = new userList();
		    	LoginController theController = new LoginController(newView,newModel);
		        theView.setVisible(false);
		        newView.setVisible(true);
		   }
	}
	
}
