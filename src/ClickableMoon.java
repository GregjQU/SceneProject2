import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

public class ClickableMoon  extends Ellipse{

	private Moon moon;
	
	public ClickableMoon (Moon moon) {
		this.moon = moon;
	}
	
	
	public ClickableMoon(Skyy skyy) {
		// TODO Auto-generated constructor stub
	}


	public void mouseClicked(MouseEvent e) {
		moon.increaseSize(2);
	}
	
}
