import java.awt.event.MouseEvent;
import wheels.users.*;

public class ClickableRoundedRectangle  extends RoundedRectangle{

	private FireHydrant fireHydrant;
	
	public ClickableRoundedRectangle(FireHydrant fireHydrant) {
		
		this.fireHydrant = fireHydrant;
	}
	
	
	public void mouseClicked(MouseEvent e) {
		fireHydrant.increaseSize(2);
	}
	
	
	
}
