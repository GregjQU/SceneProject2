import java.awt.event.MouseEvent;

import wheels.users.Ellipse;

public class ClickableMoon  extends Ellipse{

	private Skyy moon;
	
	public ClickableMoon (Skyy moon) {
		this.moon = moon;
	}
	
	
	public void mouseClicked(MouseEvent e) {
		moon.increaseSize(2);
	}
	
}
