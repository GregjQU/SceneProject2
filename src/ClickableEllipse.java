import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.Ellipse;

public class ClickableEllipse extends Ellipse {

	private ClickableEllipse ellipse;
	
	private LightBulb lightBulb;
	
	public ClickableEllipse(LightBulb lightbulb) {
		
		setColor(Color.green);
		this.lightBulb = lightbulb;
	}
	
	public ClickableEllipse() {
		
		setColor(Color.red);
	}
	
	public void mouseClicked(MouseEvent e) {
		lightBulb.setColor();
	}
	
}
