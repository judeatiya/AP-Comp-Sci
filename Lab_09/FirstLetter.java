import java.util.Scanner;

public class FirstLetter {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Please enter 5 names: ");
		
		for(int i = 0; i < words.length; i++) {
			words[i] = kb.next();
		}
		
		first(words);
		
		kb.close();
	}
	
	public static void first(String[] words) {
		System.out.println("\nFirst letter of each word...");
		for(String str : words) {
			System.out.println(str.charAt(0));
		}
	}
}
