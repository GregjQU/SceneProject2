import java.awt.Color;
import wheels.users.*;

public class Person {

	private Ellipse head;
	private RoundedRectangle body;
	
	public Person(int x, int y, Color color) {
		head = new Ellipse();
		head.setColor(color);
		head.setSize(10,10);
		
		this.setLocation(x,y);
		
		
	}
	
public  void setLocation(int x, int y) {
		
		head.setLocation(x, y);
		
		body.setLocation(x , y);
	}
public Color getColor() {
	Color colorpi= body.getColor();
	return colorpi;
}
public int getXLocation(){
	int gettx =	body.getXLocation();	
	return gettx;
}
public int getYLocation(){
	int gettY =	body.getYLocation();	
	return gettY;
}
}
