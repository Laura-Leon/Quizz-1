package controller;

import model.Logic;
import processing.core.PApplet;

public class ScreenController {
	PApplet app; 
	Logic myfig;

	
public ScreenController(PApplet app) {
	this.app = app;
	myfig = new Logic(app);
	
}
public void pintarController() {
	myfig.pintarfig();
}

}
