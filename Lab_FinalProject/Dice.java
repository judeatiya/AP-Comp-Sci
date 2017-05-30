import java.util.Random;

public class Dice {
	
	public static String roll(int buckLeft) {
		Random rand = new Random();
		String returnString = "";
		int first = 0;
		int second = 0;
		int third = 0;
		
		if(buckLeft == 1) {
			first = rand.nextInt(6) + 1;
			
			if(first == 1)
				returnString = "L";
			if(first == 2)
				returnString = "R";
			if(first == 3)
				returnString = "C";
			else
				returnString = ":";
		}
		
		if(buckLeft == 2) {
			first = rand.nextInt(6) + 1;
			second = rand.nextInt(6) + 1;
			
			if(first == 1)
				returnString = "L";
			if(first == 2)
				returnString = "R";
			if(first == 3)
				returnString = "C";
			else if(first > 3)
				returnString = ":";
			
			if(second == 1)
				returnString = returnString + "\tL";
			if(second == 2)
				returnString = returnString + "\tR";
			if(second == 3)
				returnString = returnString + "\tC";
			else if(second > 3)
				returnString = returnString + "\t:";
		}
		
		if(buckLeft == 3) {
			first = rand.nextInt(6) + 1;
			second = rand.nextInt(6) + 1;
			third = rand.nextInt(6) + 1;
			
			if(first == 1)
				returnString = "L";
			if(first == 2)
				returnString = "R";
			if(first == 3)
				returnString = "C";
			else if(first > 3)
				returnString = ":";
			
			if(second == 1)
				returnString = returnString + "\tL";
			if(second == 2)
				returnString = returnString + "\tR";
			if(second == 3)
				returnString = returnString + "\tC";
			else if(second > 3)
				returnString = returnString + "\t:";
			
			if(third == 1)
				returnString = returnString + "\tL";
			if(third == 2)
				returnString = returnString + "\tR";
			if(third == 3)
				returnString = returnString + "\tC";
			else if(third > 3)
				returnString = returnString + "\t:";
			
			return returnString;
		}
		
		return returnString;
	}
}
