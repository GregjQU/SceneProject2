import wheels.users.Ellipse;
import wheels.users.RoundedRectangle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class DraggableRoundedRectangle extends RoundedRectangle {

	int previousMouseX;
	int previousMouseY;
	private Truck truck;
	
	public DraggableRoundedRectangle(Truck truck) {
		
		this.truck = truck;
		
	}
	 
	public void mousePressed(MouseEvent e) {
	 
	 
	previousMouseX = e.getX();
	 
	previousMouseY = e.getY();
	  
	}
	
	public void mouseDragged(MouseEvent e) {
		 
		 
		truck.setLocation(truck.getXLocation() + e.getX() - previousMouseX, truck.getYLocation() + e.getY() - previousMouseY);
		 
		 
		previousMouseX = e.getX();
		 
		previousMouseY = e.getY();
		 
	} 
	
}
