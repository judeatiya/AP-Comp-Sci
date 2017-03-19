import java.util.Random;

public class Honda implements Location {
	private double[] location = new double[2];
	private int ID;
	
	public Honda(double[] position) {
		location = position;
		
		//returns a random 6 digit ID #
		Random rand = new Random();
		ID = rand.nextInt(9000000-1)+1000000;
	}
	
	public int getID() {
	// TODO Auto-generated method stub
		return ID;
	}
	
	public void move(double x, double y) {
		location[0] = location[0] + x;
		location[1] = location[1] + y;
	}
	
	public double[] getLoc() {
		return location;
	}
}
