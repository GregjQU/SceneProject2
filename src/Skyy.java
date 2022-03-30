
import wheels.users.*;
import java.awt.Color;

//change moon into the sun and have the sky change to blue
//use worm from lab 4 as a template
public class Skyy {
	private Rectangle skyy;
	private Ellipse moon;
	public Skyy(int x, int y) {
		skyy= new Rectangle();
		skyy.setColor(Color.ORANGE);
		skyy.setSize(700,550);
		
		moon= new Ellipse();
		moon.setColor(Color.white);
		moon.setSize(70, 70);
	
		setLocation(x,y);	
	}
	public  void setLocation(int x, int y) {
		skyy.setLocation(x, y);
		moon.setLocation(x + 600, y);
	}
	public void setColor(Color color) {
		skyy.setColor(color);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
