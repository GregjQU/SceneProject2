

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
	private Person person;
	private Truck truck;
	
	//private Window window;
//	private StreetLamp streetLamp2;
	
	public City(int x, int y) {
		skyy= new Skyy(x, y);
		building = new Building(x,y);
		street= new Streets(x, y);
		building2 = new Building(x + 300,y +100);
		
	
		building2.setColor(Color.blue);
		streetLamp = new StreetLamp(x, y + 37, null);
		taxi = new Taxi(x, y+ 390); 
		person =new Person(x,y);
		truck = new Truck(x, y);
	}
	
	
	public  void setLocation(int x, int y) {
		// TODO Auto-generated method stub
	skyy.setLocation(x, y);
		building.setLocation(x, y);
street.setLocation(x + 400, y);
streetLamp.setLocation(x, y);
taxi.setLocation(x, y);
person.setLocation(x, y+ 60);
truck.setLocation(x, y);
	}

	
}
