import java.util.Scanner;

public class LeftTriangle {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);	
		System.out.println("Please enter a word: ");
		String str = kb.nextLine();
		
		//System.out.println("\n");
		for(int i = 0; i < str.length(); i++) {
			System.out.println( str.substring(i, str.length()) );
		}		
	}
}	
