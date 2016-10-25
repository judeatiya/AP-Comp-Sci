import java.util.Scanner;

public class GPACalculator {
	
	public static void main(String[]args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your grade for Science: ");
		String science = keyboard.nextLine();
		System.out.println("Please enter your grade for Math: ");
		String math = keyboard.nextLine();
		System.out.println("Please enter your grade for History: ");
		String history = keyboard.nextLine();
		System.out.println("Please enter your grade for English: ");
		String english = keyboard.nextLine();
		System.out.println("Please enter your grade for AP Computer Science: ");
		String apCompSci = keyboard.nextLine();
		System.out.println("Please enter your grade for AP Pyschology: ");
		String apPysch = keyboard.nextLine();
		
		double gPoints = calcPoints(science) + calcPoints(math) + calcPoints(history) +
					calcPoints(english) + calcPoints(apCompSci) + calcPoints(apPysch);
	
		Double gpa = gPoints / 6;
		
		printGPA(gpa);
			
	}
	
	public static void printGPA(double num) {
		System.out.printf("Your gpa is: %.2f", num);
	}
	
	public static double calcPoints(String grade) {
	
		if (grade.equals("A"))
			return 4.0;
		else if (grade.equals("B"))
			return 3.0;
		else if (grade.equals("C"))
			return 2.0;
		else if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}