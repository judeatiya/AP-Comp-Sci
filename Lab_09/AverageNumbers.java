import java.util.Scanner;

public class AverageNumbers {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] numbers = new int[10];
				
		for(int i = 0; i < numbers.length; i++) {
			//(Max - Min + 1) + 1 for [1,100]
			numbers[i] = (int)(Math.random()*(100-1+1)) + 1;
		}
		
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		
		System.out.println("\nThe average of the above numbers is: " + 
							average(numbers) );
	}
	
	public static double average(int[] numbers) {
		int total = 0;
		
		for(int num : numbers) {
			total = total + num;
		}
		
		return (total/10.0);
	}
}
