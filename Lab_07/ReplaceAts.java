import java.util.Scanner;

public class ReplaceAts {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentance: ");
		String input = kb.nextLine();
		
		System.out.println("The new sentance is: "
							+ replace(input));
	}
	
	public static String replace(String input) {
		return input = input.replaceAll("a", "@");
	}
}
