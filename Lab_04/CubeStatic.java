import java.util.Scanner;

public class CubeStatic {

	//global static variables
	static int side;
	static int sa;
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the side length of cube: ");
		side = kb.nextInt();
		
		calcSA();
		print();
		
		kb.close();
	}
	
	public static void calcSA() {
		sa = 6*side*side;
	}
	
	public static void print() {
		System.out.printf("The surface area of a cube whose sides are %5d "+
				" units in length is: %5d", side, sa);
	}
}

	
