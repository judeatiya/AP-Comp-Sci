import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String[] names = new String[5];
		
		System.out.println("Please enter 5 names: ");
		
		for(int i = 0; i < names.length; i++) {
			names[i] = kb.next();
		}
		
		//Prints out the names in order - Enhanced for loop
		//str = names[i]
		System.out.println("\nIn Order...");
		for(String str : names) {
			System.out.println(str);
		}
		
		//Prints names in reverse order in the array
		System.out.println("\nReversed...");
		reverse(names);
	}
	
	public static void reverse(String[] names) {
		for(int i = names.length-1; i >= 0; i--)
			System.out.println(names[i]);
	}
}
