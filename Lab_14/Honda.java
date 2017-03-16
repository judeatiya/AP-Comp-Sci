import java.util.Random;

public class Honda extends Car {
	private double[] location = new double[2];
	
	public Honda(double[] position) {
		location = position;
	}
	
	public int getID() {
	// TODO Auto-generated method stub
		Random rand = new Random();
		
		//returns a random 6 digit ID #
		return rand.nextInt(9000000-1)+1000000;
	}
	
	public void move(double x, double y) {
		location[0] = location[0] + x;
		location[1] = location[1] + y;
	}
	
	public double[] getLoc() {
		return location;
	}
}
