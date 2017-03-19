import java.util.Random;

public class GMC extends Car implements Location {
	private double[] location = new double[2];
	private int ID;
	
	public GMC() {
		super();
		
		//returns a random 6 digit ID #
		Random rand = new Random();
		ID = rand.nextInt(9000000-1)+1000000;
	}
  
	public GMC(double locX, double locY) {
		super();
		
		location[0] = locX;
		location[1] = locY;
		
		//returns a random 6 digit ID #
		Random rand = new Random();
		ID = rand.nextInt(9000000-1)+1000000;
	}

	@Override
	public int getID() {
	// TODO Auto-generated method stub
		return ID;
	}
	
	public void move(double x, double y) {
		location[0] = location[0] + x;
		location[1] = location[1] + y;
	}
	
	@Override
	public double[] getLoc() {
		// TODO Auto-generated method stub
		return location;
	}
}
