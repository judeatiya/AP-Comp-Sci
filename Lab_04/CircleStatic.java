import java.util.Scanner;

public class CircleStatic {

	//global static variables
	static double radius;
	static double area;
	static final double pi = 3.14;
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius length of circle: ");
		radius = kb.nextDouble();
		
		calcArea();
		print();
		
		kb.close();
	}
	
	public static void calcArea() {
		area = pi*radius*radius;
	}
	
	public static void print() {
		System.out.printf("The area of a circle whose radius is %5f "+
				" units in length is: %5f", radius, area);
	}
}

	
