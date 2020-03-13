package view;

import processing.core.PApplet;

public class Main extends PApplet {
	String[] parametros ;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	
		
		

	}
	public void settings() {
		size(500,500);
		
		
	}
	public void setup() {
		parametros = loadStrings("../data/1.txt");
		for (String ownerInfo : parametros) {
			if(ownerInfo.contains(" ")) {
				String [] infoOwner = ownerInfo.split(" ");
				System.out.println(infoOwner[0]);
			}
		}
	}
		
	
	
		
		
	
	public void draw() {
		background (255,0,0);
		
		
	}
	
	public void mousePressed() {
		
	}

}
