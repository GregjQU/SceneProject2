import java.awt.Color;
import wheels.users.*;

public class HydrantTop {

	private RoundedRectangle top;
	private RoundedRectangle detail;

	public HydrantTop(int x, int y, FireHydrant fireHydrant) {

		top = new ClickableRoundedRectangle(fireHydrant);
		top.setColor(Color.red);
		top.setSize(10, 15);

		detail = new ClickableRoundedRectangle(fireHydrant);
		detail.setFillColor(Color.gray);
		detail.setSize(5, 5);

		setLocation(x, y);
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub }
	 */

	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		top.setLocation(x, y);
		detail.setLocation(top.getXLocation() + 2, top.getYLocation());
	}

	public int getYLocation() {
		// TODO Auto-generated method stub
		return top.getYLocation();
	}

	public int getXLocation() {
		// TODO Auto-generated method stub
		return top.getXLocation();
	}

	public void increaseSize(int amount) {
		// TODO Auto-generated method stub
		top.setSize(top.getWidth() + amount, top.getHeight() + amount);
		detail.setSize(top.getWidth() + amount, top.getHeight() + amount);

	}
}
