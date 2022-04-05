import java.awt.Color;
import wheels.users.Ellipse;
public class Moon {

	private  ClickableMoon moon;
	
	public  Moon(int x, int y, Skyy skyy) {
		moon = new ClickableMoon(skyy);
		moon.setColor(Color.gray);
		moon.setSize(80,80);
		
		setLocation(x, y);
		
	}
	
	public void setLocation(int x, int y) {
		moon.setLocation(x + 90, y + 20);
       // segment2.setLocation(x + 160, y + 20);
	}
	
	public void increaseSize(int amount) {
		moon.setSize(moon.getWidth() + amount, moon.getHeight() + amount);
	//	segment2.setSize(segment2.getWidth() + amount, segment2.getHeight() + amount);
	}

}
