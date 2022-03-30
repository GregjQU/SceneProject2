
import java.awt.Color;

import wheels.users.*;


public class Building {

	private Rectangle building;
	private Windows window1, window2,window3,window4,window5,window6;

	
	public Building(int x, int y) {
		building = new Rectangle();
		building.setColor(Color.GRAY);
		building.setSize(200,400);
		
		//window
		window1 = new Windows(0,0, Color.yellow);
		/*
		window1.setColor(Color.yellow);
		window1.setSize(40,40);
			*/
		window2 = new Windows(0,0, Color.yellow);
	//	window2.setColor(Color.yellow);
	//	window2.setSize(40,40);
			
		window3 = new Windows(0,0,Color.yellow);
	//	window3.setColor(Color.yellow);
		//window3.setSize(40,40);
	
			
		window4 = new Windows(0,0,Color.yellow);
	//	window4.setColor(Color.yellow);
	//	
			
		window5 = new Windows(0,0,Color.red);
	//	window5.setColor(Color.yellow);
	//	window5.setSize(40,40);
		
		window6 = new Windows(0,0,Color.yellow);
	//	window6.setColor(Color.yellow);
	//	window6.setSize(40,40);
		
		setLocation(x, y);
		
	}
	
	
	public  void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		building.setLocation(x ,y );
		//building.setLocation(90, 50);
		window1.setLocation(x + 30, y + 40);
		window2.setLocation( x + 80, y + 40);
		window3.setLocation( x + 130, y+ 40);
		window4.setLocation(x + 130, y + 100);
		window5.setLocation(x + 80, y + 100);
		window6.setLocation(x + 30, y + 100);
		
	}
	public void setColor(Color color) {
		building.setColor(color);
		
		/*
		window1.setColor(Color);
		window2.setColor(Color.yellow);
		window3.setColor(Color.yellow);
		window4.setColor(Color.yellow);
		window5.setColor(Color.yellow);
		window6.setColor(Color.yellow);
		*/
		
	}

}
