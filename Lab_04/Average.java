import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter 1st of 3 numbers: ");
		int num1 = kb.nextInt();
		
		System.out.println("Please enter 2nd of 3 numbers: ");
		int num2 = kb.nextInt();
		
		System.out.println("Please enter 3rd of 3 numbers: ");
		int num3 = kb.nextInt();
		
		double mean = average(num1, num2, num3);
		print(mean);
	}
	
	public static double average(int n1, int n2, int n3) {
		return (n1 + n2 + n3)/3.0;
	}
	
	public static void print(double avg) {
		System.out.printf("\nThe average of these 3 numbers are: %10.5f", avg);
	}
}
