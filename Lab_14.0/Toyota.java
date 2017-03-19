import java.util.Random;

public class Toyota implements Location {
	private double[] location = new double[2];
	private int ID;
	
	public Toyota(String str) {
		String[] position = str.split(", ");
		
		location[0] = Double.parseDouble(position[0]); 
		location[1] = Double.parseDouble(position[1]); 
		
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
		return location;
	}
}
