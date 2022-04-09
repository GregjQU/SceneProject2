
import java.awt.Color;

//import street.Street;
import wheels.users.Rectangle;

public class City {
	private Skyy skyy;

	private Building building;
	private Building building2;

	private StreetLamp streetLamp;
	private Taxi taxi;
	private Streets street;
	private FireHydrant fireHydrant;
	private Person person;
	private Truck truck;
	private ClickableMoon moon;
	// private Window window;
//	private StreetLamp streetLamp2;

	public City(int x, int y, Scene scene) {
		skyy = new Skyy(x, y);

		// City city = null;
		//moon = new ClickableMoon(x, y, this);

		building = new Building(x, y);
		street = new Streets(x, y);
		fireHydrant = new FireHydrant(x, y);

		truck = new Truck(x + 100, y + 420);
		building2 = new Building(x + 300, y + 100);

		building2.setColor(Color.blue);
		streetLamp = new StreetLamp(x, y + 37, null);
		taxi = new Taxi(x, y + 390);
		person = new Person(x, y);

	}

	public int getXLocation() {

		return moon.getXLocation();
	}

	public int getYLocation() {

		return moon.getYLocation();
	}

	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		skyy.setLocation(x, y);
	//	moon.setLocation(x, y);
		building.setLocation(x, y);
		street.setLocation(x + 400, y);
		fireHydrant.setLocation(x + 395, y + 450);
		streetLamp.setLocation(x, y);
		taxi.setLocation(x, y);
		person.setLocation(x, y + 60);
		truck.setLocation(x, y);
	}

	public void increaseSize(int amount) {
		// TODO Auto-generated method stub

//
		// clickableMoon.setSize(clickableMoon.getWidth() + amount,
		// clickableMoon.getHeight() + amount);
		moon.increaseSize(amount);
	}

}
