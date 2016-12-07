public class BiggestNumber {
	public static int[] numbers = new int[10];
	
	public static void main(String[] args) {
		
		//Fill array randomly with numbers from [1-100]
		fillArray(numbers);
		
		//print out array of integers that was filled.
		System.out.println("For the following numbers: ");
		printArray(numbers);
		
		//Output biggest number of the int array
		System.out.println("\nThere biggest number is: " + 
							getBiggest(numbers) );
	}
	
	//Fill array method
	public static void fillArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++)
			//(Max - Min + 1) + 1 for [1,100]
			intArray[i] = (int)(Math.random()*(100-1+1)) + 1;
	}
	
	//Print array method
	public static void printArray(int[] intArray) {
		for( int num : intArray )
			System.out.print(num + " ");
	}
	
	//Find max in int array method
	public static int getBiggest(int[] intArray) {
		int max = 0;
		
		for( int num : intArray ) {
			if(num >= max)
				max = num;
		}
		
		return max;
	}
}

