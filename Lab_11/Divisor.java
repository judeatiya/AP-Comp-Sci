import java.util.Scanner;

public class Divisor {
	
	public static void main(String[] args) {
		int[][] nums = new int[4][4];
		Scanner kb = new Scanner(System.in); 
		
		for( int row = 0; row < nums.length; ++row )
			for( int col = 0; col < nums[row].length; ++col ) 
				nums[row][col] = (int)(Math.random()*(100-1+1)) + 1;
		
		for( int row = 0; row < nums.length; ++row ) {
			for( int col = 0; col < nums[row].length; ++col ) 
				System.out.print(nums[row][col] + "\t");
			
			System.out.println();
		}
		
		System.out.println("Please enter a divisor: ");
		int divisor = kb.nextInt();
		int count = 0; 
		
		for( int row = 0; row < nums.length; ++row )
			for( int col = 0; col < nums[row].length; ++col ) {
				if( nums[row][col]%divisor == 0   )
					count++; 
			}
		
		System.out.print(	"There are " + count +
						  	" numbers divisible by " + divisor + 
						  	" in the Array."); 
	}

}

