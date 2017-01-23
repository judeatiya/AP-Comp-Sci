import java.util.Scanner;

public class CarDriver {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter car paint: ");
		String paint = kb.nextLine();
		
		System.out.println("Please enter car interior: ");
		String interior = kb.nextLine();
		
		System.out.println("Please enter car engine: ");
		String engine = kb.nextLine();
		
		System.out.println("Please enter car tires: ");
		String tires = kb.nextLine();
		
		Car myCar = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint:\t\t" + myCar.getPaint());
		System.out.println("Interior:\t" + myCar.getInterior());
		System.out.println("Engine:\t\t" + myCar.getEngine());
		System.out.println("Tires:\t\t" + myCar.getTires());
	}
}
