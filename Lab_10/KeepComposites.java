import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class KeepComposites {

	public static void main(String[]args){
		
		Integer[] numArray = {2, 6, 8, 9, 10, 12, 13, 15, 
				              17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> numList = new ArrayList<Integer>
									 (Arrays.asList(numArray));
		
		System.out.println("Orginial list. \n" + numList);
		removePrimes(numList);
		System.out.println("Primes removed list. \n" + numList);		
	}
	
	public static int gFactor(int n) {
		int value = 0; // is prime
		
		for(int i = 2; i < n; ++i) {
			if(n%i == 0)
				return 1; // not prime
		}
		
		return value;
	}
	
	public static void removePrimes(ArrayList<Integer> nums) {
		for(int i = 0; i < nums.size(); ++i) {
			if(gFactor(nums.get(i)) == 0) {
				//num is prime delete from list
				nums.remove(i);
				--i;
			}
		}
	}
}