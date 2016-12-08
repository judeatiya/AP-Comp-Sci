import java.util.Scanner;

public class GraphTable {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);	
		System.out.println("Please enter a number: ");
		int num = kb.nextInt();
		System.out.println("Please enter a graph table size: ");
		int size = kb.nextInt();
		
		for(int i = 0; i < 10; ++i){
			System.out.println( i + "\t|\t" + (3*i+4) );
		}
			
	}
}
