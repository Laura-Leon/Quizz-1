package view;


import controller.ScreenController;
import processing.core.PApplet;

public class ScreenView {
PApplet app;
ScreenController thefigu;

public ScreenView (PApplet app) { 
	this.app = app;
	this.thefigu = new ScreenController(app);
	
}
public void pintarView() {
	thefigu.pintarController();
}
}
