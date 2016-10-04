import java.util.Scanner;

public class RectangleInstance {
	
	// Instance or object variables
	public int length = 0;
	public int width = 0;
	public int perimeter = 0;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		RectangleInstance box = new RectangleInstance();
		
		System.out.println("Enter the length of rectangle: ");
		box.length = kb.nextInt();
		
		System.out.println("Enter the width of rectangle: ");
		box.width = kb.nextInt();
		
		box.calcPerimeter();
		box.print();
	
	}
	
	public void calcPerimeter() {
		perimeter = 2*length + 2*width;
	}
	
	public void print() {
		System.out.println("Your rectangle is " + perimeter 
							+ " ft around.");	
	}
}
