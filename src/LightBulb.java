

import java.awt.Color;
import java.awt.color.*;

import wheels.users.Ellipse;
import wheels.users.Rectangle;

public class LightBulb {

	private ClickableEllipse lightBulb;
	private Rectangle cover;
	
	public LightBulb(int x, int y, Color color) {
		
		lightBulb = new ClickableEllipse(this);
		lightBulb.setColor(color);
		lightBulb.setSize(20,20);
		
		cover= new Rectangle();
		cover.setColor(Color.black);
		cover.setSize(20,10);
		
		this.setLocation(x,y);
	}
	
	public void setLocation(int x, int y) {
		lightBulb.setLocation(x,y);
		cover.setLocation(x , y);
	}
	
	public Color getColor( ) {
Color picingColor = lightBulb.getColor();
return picingColor;
	}
	/*
	public void setColor(Color color) {
		lightBulb.setColor(color);
	}
	*/
	
	public int getXLocation(){
		int getterx =	lightBulb.getXLocation();	
		return getterx;
	}
	
	public int getYLocation(){
		int getterY =	lightBulb.getYLocation();	
		return getterY;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setColor() {
		// TODO Auto-generated method stub
		Color v = lightBulb.getColor(); 
		 
		if (v == Color.yellow) {
		 
		lightBulb.setColor(Color.blue);
		 
	//	segment1.setColor(Color.blue);
		 
		}else if(v == Color.blue) {
		 
		lightBulb.setColor(Color.yellow);
		 
		//segment1.setColor(Color.green);
		 
		}
		 

	}

}
