import java.util.Scanner;

public class DistanceRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x1, x2, y1, y2;
		
		System.out.println("Please enter x1: ");
		x1 = kb.nextInt();
		System.out.println("Please enter y1: ");
		y1 = kb.nextInt();
		System.out.println("Please enter x2: ");
		x2 = kb.nextInt();
		System.out.println("Please enter y2: ");
		y2 = kb.nextInt();
		
		Distance Range1 = new Distance(x1,y1,x2,y2);
				
		System.out.println("Distance1 = " + 
			 String.format("%.2f", Range1.getDistance()) );
		
		Range1.setX1(3);
		Range1.setY1(5);
		Range1.setX2(4);
		Range1.setY2(6);
		
		System.out.println("Distance2 (3,5) to (4,6) = " + 
				 String.format("%.2f", Range1.getDistance()) );
			
	}
}
