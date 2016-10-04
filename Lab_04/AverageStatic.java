import java.util.Scanner;

public class AverageStatic {
	 //Global Static varibles
	static int num1;
	static int num2;
	static int num3;
	static double average;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter 1st of 3 numbers: ");
		num1 = kb.nextInt();
		
		System.out.println("Please enter 2nd of 3 numbers: ");
		num2 = kb.nextInt();
		
		System.out.println("Please enter 3rd of 3 numbers: ");
		num3 = kb.nextInt();
		
		//double mean = average(num1, num2, num3);
		print( average (num1, num2, num3) );
	}
	
	public static double average(int n1, int n2, int n3) {
		return (n1 + n2 + n3)/3.0;
	}
	
	public static void print(double avg) {
		System.out.printf("\nThe average of these 3 numbers are: %10.5f", avg);
	}
}
