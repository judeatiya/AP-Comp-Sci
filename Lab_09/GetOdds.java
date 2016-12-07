public class GetOdds {
	public static int[] numbers = new int[10];
	
	public static void main(String[] args) {
		
		fillArray(numbers);
		
		//print out array of integers that was filled.
		System.out.println("For the following numbers: ");
		printArray(numbers);
		
		System.out.println("\nThe " + getOdds(numbers) 
							+ "are odd numbers");
	}
	
	public static void fillArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++)
			//(Max - Min + 1) + 1 for [1,100]
			intArray[i] = (int)(Math.random()*(100-1+1)) + 1;
	}
	
	public static void printArray(int[] intArray) {
		for( int num : intArray )
			System.out.print(num + " ");
	}
	
	public static String getOdds(int[] intArray) {
		String odds = "";
		
		for( int num : intArray ) {
			if(num%2 == 1)
				odds = odds + num + " ";
		}
		
		return odds;
	}
}
