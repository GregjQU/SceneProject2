import wheels.users.Ellipse;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class DraggableEllipse extends Ellipse {

	int previousMouseX;
	int previousMouseY;
	private Person person;
	
	public DraggableEllipse(Person person) {
		 
		this.person = person;
		 
		 
		}
		 
		 
		public void mousePressed(MouseEvent e) {
		 
		 
		previousMouseX = e.getX();
		 
		previousMouseY = e.getY();
		 
		 
		}
		 
		public void mouseDragged(MouseEvent e) {
			 
			 
			person.setLocation(person.getXLocation() + e.getX() - previousMouseX, person.getYLocation() + e.getY() - previousMouseY);
			 
			 
			previousMouseX = e.getX();
			 
			previousMouseY = e.getY();
			 
		} 

	
	
}
