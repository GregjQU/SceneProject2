
import wheels.users.*;
import java.awt.Color;

public class Streets {
	private Rectangle street,road;
	private Person guy;
	private Ellipse sewer;
	
	public Streets(int x, int y) {
		street = new Rectangle();
		street.setColor(Color.GRAY);
		street.setSize(700,400);
		
		road= new Rectangle();
		road.setColor(Color.darkGray);
		road.setSize(700,50);
		
		//guy = new Person(x, y, color);
		
				
				
		sewer = new Ellipse();
		sewer.setColor(Color.LIGHT_GRAY);
		sewer.setSize(40,40);
		setLocation(x,y);
	} 
	
	public void setLocation(int x, int y) {
		street.setLocation(x ,y + 400);
		road.setLocation(x, y+ 420);
		sewer.setLocation(x + 200,y + 425);
	}
	public void setColor(Color color) {
		street.setColor(color);
	}
	
}
