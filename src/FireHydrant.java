import java.awt.Color;
import wheels.users.*;

public class FireHydrant {
RoundedRectangle base;
RoundedRectangle middle;
private HydrantTop top;

public FireHydrant(int x,int y) {
	
	base = new RoundedRectangle();
	base.setColor(Color.red);
	base.setSize(10, 25);
	
	
	middle = new RoundedRectangle();
	middle.setColor(Color.red);
	middle.setSize(20,10);
	/*
	top = new RoundedRectangle();
	top.setColor(Color.blue);
	top.setSize(10,10);
	*/
	
	top= new HydrantTop(x, y, this);
	
	this.setLocation(x,y);
	
}

public int getXLocation1() {
	return top.getXLocation();
}

public int getYLocation1() {
	return top.getYLocation();
}


public  void setLocation(int x, int y) {
	
	base.setLocation(x + 230, y + 390);
	middle.setLocation(x + 225, y + 399);
	top.setLocation(x + 230, y + 390);
	
	//top.setLocation(x,y);
}

public void increaseSize(int amount) {
	top.increaseSize(amount);
	
}




public Color getColor() {
	Color colorpi= base.getColor();
	return colorpi;
}
public int getXLocation(){
	int gettx =	base.getXLocation();	
	return gettx;
}
public int getYLocation(){
	int gettY =	base.getYLocation();	
	return gettY;
}

/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/

}
