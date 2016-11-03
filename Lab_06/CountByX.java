import java.util.Scanner;

public class CountByX {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		
		System.out.println("Please enter a count: ");
		int count = kb.nextInt();
		
		for(int i = 0; i < num; i = i+count ) {
			System.out.print(i + " ");
		}
	}
}