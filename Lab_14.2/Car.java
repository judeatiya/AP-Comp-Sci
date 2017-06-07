//import java.util.Random;

public class Car implements Location {
	protected int ID;
	protected double[] location = new double[2];
	
	public Car() {
		super();
	}
	
	public Car(double[] location) {
		this.location = location;
	}

	public Car(double x, double y) {
		location[0] = x;
		location[1] = y;
	}

	@Override
	public void move(double x, double y) {
		location[0] = getLoc()[0] + x;
		location[1] = getLoc()[1] + y;
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}
	
	@Override
	public double[] getLoc() {
		// TODO Auto-generated method stub
		return location;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
