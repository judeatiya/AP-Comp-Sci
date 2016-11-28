import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String[] names = new String[5];
		
		System.out.println("Please enter 5 names: ");
		
		for(int i = 0; i < names.length; i++) {
			names[i] = kb.next();
		}
		
		System.out.println("\nIn Order...");
		for(String str : names) {
			System.out.println(str);
		}
		
		System.out.println("\nReversed...");
		reverse(names);
	}
	
	public static void reverse(String[] names) {
		for(int i = names.length-1; i >= 0; i--)
			System.out.println(names[i]);
	}
}
