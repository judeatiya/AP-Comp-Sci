import java.util.Scanner;

public class TwoInput {
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		int num1 = keyboard.nextInt();
		
		System.out.println("Please enter the second number: ");
		int num2 = keyboard.nextInt();
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		System.out.println("First input plus second is: " + sum);
		System.out.println("First input subtracted by second is: " + minus);
		System.out.println("First input mulitpied by second is: " + num1*num2);
		System.out.println("First input divided by second is: " + (double)num1/num2);
	}
}
