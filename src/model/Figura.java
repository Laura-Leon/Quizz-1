package model;

import processing.core.PApplet;

public abstract class Figura {
	int X;
	int Y;
	int tam;
	PApplet app;
	int vel;
	
	
	public Figura (int X, int Y,int tam, PApplet app) {
		this.app=app;
		
		this.X = X;
		this.Y = Y;
		
		this.tam = 20;
		this.vel = 5;
		
		
	}
	public abstract void mover();
	public abstract void pintar();
	
	//getters y setters
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}
	public PApplet getApp() {
		return app;
	}
	public void setApp(PApplet app) {
		this.app = app;
	}
	public int getVel() {
		return vel;
	}
	public void setVel(int vel) {
		this.vel = vel;
	}
	

}
