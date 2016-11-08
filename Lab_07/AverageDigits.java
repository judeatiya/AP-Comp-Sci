import java.util.Scanner;

public class AverageDigits {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		
		// %d = integer. %f is for double
		System.out.printf("The average of the digits in %d is %.2f", num, aveDigits(num));
	}
	
	public static double aveDigits(int num) {
		int sum = 0;
		int i = 0;
		
		while ( num > 0 ) {
			sum = sum + num%10;
			num = num/10;
			++i;
		}
		
		return (double)sum/i;
	}
}
