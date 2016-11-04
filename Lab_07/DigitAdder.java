import java.util.Scanner;

public class DigitAdder {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		
		System.out.println("The sum of the digits in " + num 
							+ " is " + sumDigits(num));
	}
	
	public static int sumDigits(int num) {
		int sum = 0;
		
		while ( num > 0 ) {
			sum = sum + num%10;
			num = num/10;
		}
		
		return sum;
	}
}
