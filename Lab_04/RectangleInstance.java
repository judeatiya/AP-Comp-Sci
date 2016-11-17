import java.util.Scanner;

public class RectangleInstance {
	
	public static void main(String[] args) {
		int length = 0;
		int width = 0;
		int perimeter = 0;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle: ");
		length = kb.nextInt();
		
		System.out.println("Enter the width of rectangle: ");
		width = kb.nextInt();
		
		perimeter = calcPerimeter(length, width);
		print(perimeter);
	
	}
	
	public static int calcPerimeter(int length, int width) {
		return (2*length + 2*width);
	}
	
	public static void print(int perimeter) {
		System.out.println("Your rectangle is " + perimeter 
							+ " ft around.");	
	}
}
