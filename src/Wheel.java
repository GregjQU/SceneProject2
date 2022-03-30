
import java.awt.Color;
import java.awt.color.*;

import wheels.users.*;

public class Wheel {

	private Ellipse wheel1;
	//private Ellipse wheel2;
	private Ellipse hubcap;
	
	public Wheel(int x, int y, Color color) {
		wheel1 = new Ellipse();
		wheel1.setColor(color);
		wheel1.setSize(20,20);
		
		/*
		wheel2 = new Ellipse();
		wheel2.setColor(color);
		wheel2.setSize(20,20);
		*/
		hubcap = new Ellipse();
		hubcap.setColor(Color.lightGray);
		hubcap.setSize(10,10);
		
		this.setLocation(x,y);
		
	}
	public  void setLocation(int x, int y) {
		
		wheel1.setLocation(x, y);
		//wheel2.setLocation(x, y);
		hubcap.setLocation(x + 5, y+5);
	}
	public Color getColor() {
		Color colorpi= wheel1.getColor();
		return colorpi;
	}
	 
public void setColor(Color color) {
		
		wheel1.setColor(color);
	}
	
public int getXLocation(){
	int gettx =	wheel1.getXLocation();	
	return gettx;
}

public int getYLocation(){
	int gettY =	wheel1.getYLocation();	
	return gettY;
}


}
