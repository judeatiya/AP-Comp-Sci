import java.util.Scanner;

public class ReverseDigits {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		
		System.out.println("The reverse of the digits in " + num 
							+ " is " + revDigits(num));
	}
	
	public static int revDigits(int number) {
		int num = number;
		int rev = 0;
		
		//123 to 321
		while ( num > 0 ) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		return rev;
	}
}
