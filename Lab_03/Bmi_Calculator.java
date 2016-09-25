import java.util.Scanner;

public class Bmi_Calculator {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your weight in pounds: ");
		int weight = keyboard.nextInt();
		//System.out.println("The weight is: " + weight);
		
		System.out.println("Please enter your height in feet:");
		int feet = keyboard.nextInt();
		System.out.println("Please enter the rest of your height in inches:");
		int inches = keyboard.nextInt();
		//System.out.println("The height in feet: " + feet);
		//System.out.println("The height in inches: " + inches);
		
		int height = feet*12 + inches;
		System.out.println("The total height in inches: " + height);

		double bmi = ((double)weight/(height*height)) * 703.0;
		System.out.println("Your BMI is: " + bmi);

	}
}
