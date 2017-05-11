import java.util.Random;

public class Toyota extends Car {
	private double[] location = new double[2];
	
	public Toyota(String str) {
		String[] position = str.split(", ");
		
		location[0] = Double.parseDouble(position[0]); 
		location[1] = Double.parseDouble(position[1]); 
	}
	
	@Override
	public double[] getLoc() {
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
