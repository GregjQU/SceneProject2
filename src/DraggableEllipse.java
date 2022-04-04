import wheels.users.Ellipse;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class DraggableEllipse extends Ellipse {

	int previousMouseX;
	int previousMouseY;
	private Truck truck;
	/*
	public DraggableEllipse(Tires tires) {
		 
		this.tires = tires;
		 
		 
		}
		*/ 
		
		public DraggableEllipse(Truck truck) {
		this.truck=truck;
			// TODO Auto-generated constructor stub
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
