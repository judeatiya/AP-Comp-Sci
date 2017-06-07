import java.util.Random;

public class Honda extends Car {	
	Honda(double[] location) {
		super(location);
		
		//returns a random 6 digit ID #
		Random rand = new Random();
		super.setID(rand.nextInt(9000000-1)+1000000);
	}
}
