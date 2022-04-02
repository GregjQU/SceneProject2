import wheels.users.Ellipse;
import wheels.users.RoundedRectangle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class DraggableRoundedRectangle extends RoundedRectangle {

	int previousMouseX;
	int previousMouseY;
	private Taxi taxi;
	
	public DraggableRoundedRectangle(Taxi taxi) {
		
		this.taxi = taxi;
		
	}
	 
	public void mousePressed(MouseEvent e) {
	 
	 
	previousMouseX = e.getX();
	 
	previousMouseY = e.getY();
	  
	}
	
	public void mouseDragged(MouseEvent e) {
		 
		 
		taxi.setLocation(taxi.getXLocation() + e.getX() - previousMouseX, taxi.getYLocation() + e.getY() - previousMouseY);
		 
		 
		previousMouseX = e.getX();
		 
		previousMouseY = e.getY();
		 
	} 
	
}
