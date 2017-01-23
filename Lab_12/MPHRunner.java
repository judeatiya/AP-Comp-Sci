import java.util.Scanner;

public class MPHRunner {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int distance = 0;
		int hours = 0;
		int minutes = 0;
		MilesPerHour Speed1 = new MilesPerHour();
		
		System.out.println("Please enter a distance: ");
		distance = kb.nextInt();
		
		System.out.println("Please enter hours: ");
		hours = kb.nextInt();
		
		System.out.println("Please enter minutes: ");
		minutes = kb.nextInt();
		
		Speed1.setDistance(distance);
		Speed1.setHours(hours);
		Speed1.setMinutes(minutes);
		
		System.out.println( Speed1.getDistance() + " miles in " +
							Speed1.getHours() + " hours and " +
							Speed1.getMinutes() + " minutes = " +
							Speed1.getMph() + " mph.");		
	}
}
