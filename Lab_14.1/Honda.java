import java.util.Random;

public class Honda extends Car {
	private double[] location = new double[2];
	
	public Honda(double[] position) {
		location = position;
	}
	
	//Override: return location
	public double[] getLoc() {
		return location;
	}
	
	//Override: ID
	public int getID() {
	// TODO Auto-generated method stub
		Random rand = new Random();
		
		//returns a random 6 digit ID #
		return rand.nextInt(9000000-1)+1000000;
	}
}
