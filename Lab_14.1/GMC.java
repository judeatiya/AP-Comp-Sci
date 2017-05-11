import java.util.Random;

public class GMC extends Car {
	private double[] location = new double[2];
	
	public GMC() {
		super();
	}
  
	public GMC(double locX, double locY) {
		super();
		
		location[0] = locX;
		location[1] = locY;
	}

	@Override
	public double[] getLoc() {
		// TODO Auto-generated method stub
		return location;
	}
	
	@Override
	public int getID() {
	// TODO Auto-generated method stub
		Random rand = new Random();
		
		//returns a random 6 digit ID #
		return rand.nextInt(9000000-1)+1000000;
	}
}
