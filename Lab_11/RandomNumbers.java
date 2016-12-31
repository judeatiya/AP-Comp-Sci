
public class RandomNumbers {
	
	public static void main(String[] args) {
		int[][] nums = new int[4][4];
		
		for( int row = 0; row < nums.length; ++row )
			for( int col = 0; col < nums[row].length; ++col ) 
				nums[row][col] = (int)(Math.random()*(100-1+1)) + 1;
		
		for( int row = 0; row < nums.length; ++row ) {
			for( int col = 0; col < nums[row].length; ++col ) 
				System.out.print(nums[row][col] + " ");
			
			System.out.println();
		}
	}

}
