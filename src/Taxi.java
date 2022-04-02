

import java.awt.Color;
import wheels.users.*;

//going to make taxi a draggable object
public class Taxi {

	//private ClickableObject taxi;
	//private RoundedRectangle  ;
	private DraggableRoundedRectangle taxi, windsheild;
	private Wheel wheel1, wheel2;
	private Rectangle taxiSign;
	
	
	public Taxi(int x, int y ) {
		
		taxi= new DraggableRoundedRectangle(this);
		taxi.setColor(Color.yellow);
		taxi.setSize(60,40);
		
		windsheild= new DraggableRoundedRectangle(this);
		windsheild.setColor(Color.cyan);
		windsheild.setSize(30,20);
		
		taxiSign= new Rectangle();
		taxiSign.setColor(Color.lightGray);
		taxiSign.setSize(30,6);
		
		wheel1= new Wheel(0, 0, Color.black);
		wheel2= new Wheel(20, 0, Color.black);
		
		setLocation(x, y);
		
	}
	public  void setLocation(int x, int y) {
		taxi.setLocation(x, y+5);
		windsheild.setLocation(x,y+6);
		taxiSign.setLocation(x + 12, y  );
		wheel1.setLocation(x, y + 34);
		wheel2.setLocation(x + 40, y+ 34);
	}
	public void setColor() {
		Color v = taxi.getColor();
		if (v == Color.yellow) {
			
			taxi.setColor(Color.green);
		}else if (v == Color.green) {
			
			taxi.setColor(Color.yellow);
		}
		
		//taxi.setColor(color);
		
	}
	public int getXLocation() {
		// TODO Auto-generated method stub
		return taxi.getXLocation();
	}
	public int getYLocation() {
		// TODO Auto-generated method stub
		return taxi.getYLocation();
	}
	
	
}
