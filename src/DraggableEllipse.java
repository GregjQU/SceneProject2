import wheels.users.Ellipse;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class DraggableEllipse extends Ellipse {

	int previousMouseX;
	int previousMouseY;
	private Tires tires;
	
	public DraggableEllipse(Tires tires) {
		 
		this.tires = tires;
		 
		 
		}
		 
		 
		public void mousePressed(MouseEvent e) {
		 
		 
		previousMouseX = e.getX();
		 
		previousMouseY = e.getY();
		 
		 
		}
		 
		public void mouseDragged(MouseEvent e) {
			 
			 
			tires.setLocation(tires.getXLocation() + e.getX() - previousMouseX, tires.getYLocation() + e.getY() - previousMouseY);
			 
			 
			previousMouseX = e.getX();
			 
			previousMouseY = e.getY();
			 
		} 

	
	
}
