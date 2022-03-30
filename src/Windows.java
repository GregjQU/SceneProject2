
import java.awt.Color;
import java.awt.color.*;

import wheels.users.Rectangle;

public class Windows {

	//private Rectangle windows;
	private Rectangle window1;
	private Rectangle shutter1;
	
	public Windows(int x, int y, Color color) {
		
		window1 = new Rectangle();
		window1.setColor(color);
		window1.setSize(40,40);
		
		shutter1 = new Rectangle();
		shutter1.setColor(Color.darkGray);
		shutter1.setSize(40,20);
			/*
		window2 = new Rectangle();
		window2.setColor(Color.yellow);
		window2.setSize(40,40);
		*/
		
		this.setLocation(x,y);
	}
	
	public  void setLocation(int x, int y) {
		
		window1.setLocation(x , y );
		shutter1.setLocation(x , y  );
		//window2.setLocation( x - 170, y - 90);
	}
	public Color getColor() {
		Color picColor = window1.getColor();
		
		return picColor;
	}
	public void setColor(Color color) {
		
		window1.setColor(color);
	}
	public int getXLocation(){
		int getterx =	window1.getXLocation();	
		return getterx;
	}
	
	public int getYLocation(){
		int getterY =	window1.getYLocation();	
		return getterY;
	}
	

}
