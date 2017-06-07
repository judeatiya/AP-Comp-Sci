import java.util.Random;

public class Toyota extends Car {	
	public Toyota(String str) {
		String[] position = str.split(", ");
		
		super.location[0] = Double.parseDouble(position[0]); 
		super.location[1] = Double.parseDouble(position[1]); 
		
		//returns a random 6 digit ID #
		Random rand = new Random();
		super.setID(rand.nextInt(9000000-1)+1000000);
	}
}
