import java.awt.Color;
import wheels.users.*;

public class Person {

	private Ellipse head;
	private RoundedRectangle body;
	
	public Person(int x, int y) {
		head = new Ellipse();
		head.setColor(Color.green);
		head.setSize(12,12);
		
		body =new RoundedRectangle();
		body.setColor(Color.black);
		body.setSize(12,15);
		
		this.setLocation(x,y);
		
		
	}
	
public  void setLocation(int x, int y) {
		
		head.setLocation(x +80, y+ 400);
		
		body.setLocation(x + 80 , y+ 408);
	}

	public Color getColor() {
		Color colorpi = body.getColor();
		return colorpi;
	}

	public int getXLocation() {
		int gettx = body.getXLocation();
		return gettx;
	}

	public int getYLocation() {
		int gettY = body.getYLocation();
		return gettY;
	}
}
