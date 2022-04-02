
public class Truck {
private AutoBody autoBody;
private Tires tire;


public Truck (int x,int y) {
	autoBody = new AutoBody(x,y,this);
	tire = new Tires(x,y,this);
	
}
public int getXLocation() {
	return autoBody.getXLocation();
}
public int getYLocation() {
	return autoBody.getYLocation();
	
}
public void setLocation(int x, int y) {
	autoBody.setLoction(x,y);
	tire.setLocation(x,y);
	
}


}
