import java.util.Scanner;

public class CubeInstance {
	
	// Instance or object variables
	public int side = 0;
	public int sa = 0;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		CubeInstance cube = new CubeInstance();
		
		System.out.println("Enter the length of the side of the cube: ");
		cube.side = kb.nextInt();
		
		cube.calcSA();
		cube.print();
	
		kb.close();
	}
	
	public void calcSA() {
		sa = 6*side*side;
	}
	
	public void print() {
		System.out.printf("The surface area of a cube whose sides are %5d "+
							" units in length is: %5d", side, sa);
	}
}
