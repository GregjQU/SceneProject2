import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

public class ClickableMoon  extends Ellipse{

	private City moon;
	private City skyy;
	
	public ClickableMoon (int x, int y, City city) {
		this.moon = city;
	}
	
	
	public ClickableMoon(City city) {
		// TODO Auto-generated constructor stub
		this.skyy=city;
	}


	public void mouseClicked(MouseEvent e) {
	//	moon.increaseSize(2);
		//skyy.increaseSize(2);
	}


	public void increaseSize(int amount) {
		// TODO Auto-generated method stub
	//	this.moon
	}

/*
	public void increaseSize(int amount) {
		// TODO Auto-generated method stub
		
	}
	*/
}
