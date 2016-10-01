import java.util.Scanner;

public class SubwooferBoxes {
	public static void main(String[] args){
		
		SubwooferBoxes v1 = new SubwooferBoxes();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Pleae enter the length of the box in inches:");
		int length = kb.nextInt();
				
		System.out.println("Pleae enter the width of the box in inches:");
		int width = kb.nextInt(); 		
				
		System.out.println("Pleae enter the height of the box in inches:");
		int height = kb.nextInt();
		
		System.out.printf("\nThe volume of your new subwoofer box is: %5.2f ft^3", 
							v1.volume(length, width, height));
	}
	
	public double volume(int l, int w, int h) {
		return (l/12.0)*(w/12.0)*(h/12);
	}
}
