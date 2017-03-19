import java.util.Random;

public class GMC implements Location {
	private double x;
	private double y;
	private int ID;
	
	public GMC() {
		super();
		
		//returns a random 6 digit ID #
		Random rand = new Random();
		ID = rand.nextInt(9000000-1)+1000000;
	}
  
	public GMC(double locX, double locY) {
		super();
		
		x = locX;
		y = locY;
		
		//returns a random 6 digit ID #
		Random rand = new Random();
		ID = rand.nextInt(9000000-1)+1000000;
	}

	@Override
	public int getID() {
	// TODO Auto-generated method stub
		return ID;
	}
	
	@Override
	public double[] getLoc() {
		// TODO Auto-generated method stub
		
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		
		return location;
	}
	
	public void move(double hori, double vert) {
		x = x + hori;
		y = y + vert;
	}
}
