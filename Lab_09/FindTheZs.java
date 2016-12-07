import java.util.Scanner;

public class FindTheZs {
	public static String[] words = new String[5];

	public static void main(String[] args) {
		fillArray(words);
		printArray(words);
		System.out.println("\nOnly: " + hasZs(words) +
							"contains the letter 'z' or 'Z'.");
	}
	
	//Fill String array with words
	public static void fillArray(String[] list) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 names: ");
		
		for(int i = 0; i < list.length; i++)
			list[i] = kb.next();
	}
	
	//Print String array
	public static void printArray(String[] list) {
		System.out.println("For the words: ");
		
		for(String name : list) 
			System.out.print(name + " ");
	}
	
	//Checks for 'z'
	public static String hasZs(String[] list) {
		String zs = "";
		
		for(String name : list) {
			if( name.indexOf("z") != -1 || name.indexOf("Z") != -1) 
				zs = zs + name + " ";
		}
			
		return zs;
	}
}

