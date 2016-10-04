import java.util.Scanner;

public class AverageInstance {
	 //object instance varibles
	public int num1;
	public int num2;
	public int num3;
	public double average;
	
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
		mean.print( mean.average() );
	}
	
	public double average() {
		return (num1 + num2 + num3)/3.0;
	}
	
	public void print(double avg) {
		System.out.printf("\nThe average of these 3 numbers are: %10.5f", avg);
	}
}
