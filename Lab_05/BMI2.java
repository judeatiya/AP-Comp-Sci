import java.util.Scanner;

public class BMI2 {
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
		calcCondish(bmi);

	}
	/*
	calcCondish() function <parameter = BMI>
	 Create the following conditions:
	  BMI is less than 18.5 | condition is Underweight
	  BMI is between 18.5 and 24.9 | condition is  Normal
	  BMI is between 25 and 29.9 = Overweight
	  BMI is between 29.9 and 34.9 = Obese
	  BMI is between 35 and 39.9 = Very Obese
	  BMI is greater than 39.9 = Morbidly Obese
	 */
	
	public static void calcCondish(double bmi) {
		
		if ( bmi < 18.5 )
			System.out.println("Your condition is Underweight.");
		else if ( bmi > 18.5 && bmi < 24.9)
			System.out.println("Your condition is Normal.");
		if ( bmi > 25 && bmi < 29.9)
			System.out.println("Your condition is overweight.");
		else if ( bmi > 29.9 && bmi < 34.9)
			System.out.println("Your condition is obese.");
		if ( bmi > 35 && bmi < 39.9)
			System.out.println("Your condition is very obese.");
		else if ( bmi > 39.9)
			System.out.println("Your condition is morbidly obese.");
	}
	
}
