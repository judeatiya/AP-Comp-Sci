import java.util.Scanner;

public class CircleInstance {
	
	public static void main(String[] args) {
		 double radius = 0;
		 double area = 0;
		 double pi = 3.14;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the side of the cube: ");
		radius = kb.nextDouble();
		
		area = calcArea(radius, pi);
		print(radius, area);
	
		kb.close();
	}
	
	public static double calcArea(double radius, double pi) {
		return pi*radius*radius;
	}
	
	public static void print(double radius, double area) {
		System.out.printf("The area of a circle whose radius is %5f "+
							" units in length is: %5f", radius, area);
	}
}
