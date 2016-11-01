import java.util.Scanner;

public class BoxString {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a word: ");
		String name = kb.nextLine();
		
		System.out.println("\n");
		for(int i = 0; i < name.length(); ++i) {
			System.out.println(name);
		}
	}
}
