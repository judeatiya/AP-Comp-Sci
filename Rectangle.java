import java.util.Scanner;

public class Rectangle {

	//global static variables
	static int l;
	static int w;
	static int perimeter;
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle: ");
		l = kb.nextInt();
		
		System.out.println("Enter the width of rectangle: ");
		w = kb.nextInt();
		
		calcPerimeter();
		print();
	}
	
	public static void calcPerimeter() {
		perimeter = 2*l + 2*w;	
	}
	
	public static void print() {
		System.out.println("The perimeter of your rectangle is: " + 
							perimeter);	
	}
}

	
