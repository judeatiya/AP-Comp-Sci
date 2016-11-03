import java.util.Scanner;

public class ReverseTriangle {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);	
		System.out.println("Please enter a word: ");
		String str = kb.nextLine();
		
		//System.out.println("\n");
		for(int i = str.length(); i > 0; i--) {
			System.out.println( str.substring(0, i) );
		}		
	}
}	
