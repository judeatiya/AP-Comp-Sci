import java.util.Scanner;

public class AverageInstance {
	
	public static void main(String[] args) {
		 int num1;
		 int num2;
		 int num3;
		 double average;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter 1st of 3 numbers: ");
		num1 = kb.nextInt();
		
		System.out.println("Please enter 2nd of 3 numbers: ");
		num2 = kb.nextInt();
		
		System.out.println("Please enter 3rd of 3 numbers: ");
		num3 = kb.nextInt();
		
		print( average(num1, num2, num3) );
	}
	
	public static double average(int num1, int num2, int num3) {
		return (num1 + num2 + num3)/3.0;
	}
	
	public static void print(double avg) {
		System.out.printf("\nThe average of these 3 numbers are: %10.5f", avg);
	}
}
