import java.util.Scanner;

public class AverageInstance {
	 //object instance varibles
	static int num1;
	static int num2;
	static int num3;
	static double average;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		AverageInstance mean = new AverageInstance();
		
		System.out.println("Please enter 1st of 3 numbers: ");
		mean.num1 = kb.nextInt();
		
		System.out.println("Please enter 2nd of 3 numbers: ");
		mean.num2 = kb.nextInt();
		
		System.out.println("Please enter 3rd of 3 numbers: ");
		mean.num3 = kb.nextInt();
		
		//double mean = average(num1, num2, num3);
		mean.average();
		mean.print();
	}
	
	public static void average() {
		average = (double)(num1 + num2 + num3)/3.0;
	}
	
	public void print() {
		System.out.printf("\nThe average of these 3 numbers are: %.2f", average);
	}
}
