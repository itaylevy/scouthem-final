package controller;

import controller.LoginController.LoginListener;
import model.scout;

public class ScoutController {
	private ScoutView theView;
	private scout theModel;
	
	public ScoutController(ScoutView theView, scout theModel) {
	        this.theView = theView;
	        this.theModel = theModel;
	        this.theView.addLoginListner(new LoginListener());

	    }
}
