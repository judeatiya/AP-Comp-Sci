import java.util.Scanner;

public class CircleInstance {
	
	// Instance or object variables
	public double radius = 0;
	public double area = 0;
	public static final double pi = 3.14;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		CircleInstance circle = new CircleInstance();
		
		System.out.println("Enter the length of the side of the cube: ");
		circle.radius = kb.nextDouble();
		
		circle.calcArea();
		circle.print();
	
		kb.close();
	}
	
	public void calcArea() {
		area = pi*radius*radius;
	}
	
	public void print() {
		System.out.printf("The area of a circle whose radius is %5f "+
							" units in length is: %5f", radius, area);
	}
}
