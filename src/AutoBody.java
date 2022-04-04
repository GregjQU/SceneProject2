import java.awt.Color;
import java.awt.color.*;
import wheels.users.RoundedRectangle;

public class AutoBody {
private DraggableRoundedRectangle body,top,windsheild;

	public AutoBody(int x, int y, Truck truck) {
		// TODO Auto-generated constructor stub
		body = new DraggableRoundedRectangle(truck);
		//body = new RoundedRectangle();
		body.setColor(Color.red);
		body.setSize(60, 20);
		
		top = new DraggableRoundedRectangle(truck);
		top.setColor(Color.red);
		top.setSize(40, 20);
		
		
		windsheild = new DraggableRoundedRectangle(truck);
		windsheild.setColor(Color.cyan);
		windsheild.setSize(20, 10);
		
		setLoction(x,y);
	}

	public int getXLocation() {
		return body.getXLocation();
	}
	
	public int getYLocation() {
		// TODO Auto-generated method stub
		return  body.getYLocation();
	}
	/*
	private void setLocation(int x, int y) {
		// TODO Auto-generated method stub
	body.setLocation(x, y);	
	}
*/
	public void setLoction(int x, int y) {
		// TODO Auto-generated method stub
		body.setLocation(x, y);
		top.setLocation(body.getXLocation() , body.getYLocation()- 10);
		windsheild.setLocation(body.getXLocation() + 20 , body.getYLocation()- 10);
		
	}

	

}
