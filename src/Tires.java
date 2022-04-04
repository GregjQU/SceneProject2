import java.awt.Color;
import wheels.users.Ellipse;

public class Tires {

	private DraggableEllipse tire;
	private DraggableEllipse tire1;
	// private Truck truck;

	public Tires(int x, int y, Truck truck) {
		// TODO Auto-generated constructor stub
		tire = new DraggableEllipse(truck);
		tire.setSize(20, 20);
		tire.setColor(Color.black);

		tire1 = new DraggableEllipse(truck);
		tire1.setSize(20, 20);
		tire1.setColor(Color.black);

		setLocation(x, y);

	}

	/*
	 * public Tire(int x, int y, Truck truck) {
	 * 
	 * }
	 */

	public int getXLocation() {
		// TODO Auto-generated method stub
		return tire.getXLocation();
	}

	public int getYLocation() {
		// TODO Auto-generated method stub
		return tire.getYLocation();
	}

	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		tire.setLocation(x, y + 10);
		tire1.setLocation(tire.getXLocation() +40,tire.getYLocation());
		//+40 ,+10
	}
}
