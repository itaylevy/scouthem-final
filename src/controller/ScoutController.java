package controller;

import controller.LoginController.LoginListener;
import model.scout;
import view.ScoutScreen;

public class ScoutController {
	private ScoutScreen theView;
	private scout theModel;
	
	public ScoutController(ScoutScreen theView, scout theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
//	        this.theView.addLoginListner(new LoginListener());

	    }
	
}
