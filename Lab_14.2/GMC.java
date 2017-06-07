import java.util.Random;

public class GMC extends Car {
	public GMC(double x, double y) {
		super(x,y);
		
		//returns a random 6 digit ID #
		Random rand = new Random();
		super.setID(rand.nextInt(9000000-1)+1000000);
	}
}
