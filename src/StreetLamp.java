
import wheels.users.*;

import java.awt.Color;
import java.awt.color.*;

public class StreetLamp {

	private Rectangle base;
	private Rectangle pole;
	private LightBulb lightBulb;
	private Rectangle poleTop;
	
	public StreetLamp (int x, int y, Color color) {
		//base of the street lamp
		base = new Rectangle();
		base.setColor(color);
		base.setSize(15,30);
		
		pole = new Rectangle();
		pole.setColor(Color.black);
		pole.setSize(10,60);
		
		//this calls the lightBulb class  and sets the color
		lightBulb = new  LightBulb(0, 0, Color.yellow);
		
		//this connects the lightBulb to the base
		poleTop = new Rectangle();
		poleTop.setColor(Color.black);
		poleTop.setSize(40,10);
		
		setLocation(x,y);
		
	}
	public void setLocation(int x, int y) {
		base.setLocation(x,y + 350);
		pole.setLocation(x + 2, y + 300);
		lightBulb.setLocation(x + 20, y + 300);
		poleTop.setLocation(x,y + 290);
		
	}
	
	public void setColor(Color color) {
		base.setColor(color);
		pole.setColor(color);
		//lightBulb.setColor(color);
		poleTop.setColor(color);
	}
	
	public int getXLocation(){
		int getterx =	pole.getXLocation();	
		return getterx;
	}
	
	public int getYLocation(){
		int getterY =	pole.getYLocation();	
		return getterY;
	}
	
	public Color getColor() {
		Color getLampC= base.getColor();
		return getLampC;
	}

}
