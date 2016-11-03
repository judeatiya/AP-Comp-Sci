import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);	
		System.out.println("Please enter a word: ");
		String str = kb.nextLine();
		
		for(int i = str.length(); i > 0; i--) {
			System.out.println( str.substring(i - 1, str.length()) );
		}		
	}
}	