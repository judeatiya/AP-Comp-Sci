import java.util.Scanner;

public class CubeInstance {
	
	public static void main(String[] args) {
		int side = 0;
		int sa = 0;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the side of the cube: ");
		side = kb.nextInt();
		
		sa = calcSA(side);
		print(side, sa);
	
		kb.close();
	}
	
	public static int calcSA(int side) {
		return 6*side*side;
	}
	
	public static void print(int side, int sa) {
		System.out.printf("The surface area of a cube whose sides are %5d "+
							" units in length is: %5d", side, sa);
	}
}
