//import java.util.Random;

public class Car implements Location {
	private int ID;
	private double[] loc = new double[2];

	public void setID(int iD) {
		ID = iD;
	}
	
	public void move(double x, double y) {
		loc[0] = getLoc()[0] + x;
		loc[1] = getLoc()[1] + y;
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}
	
	@Override
	public double[] getLoc() {
		// TODO Auto-generated method stub
		return loc;
	}
}
