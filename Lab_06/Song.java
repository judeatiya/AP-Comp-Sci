import java.util.Scanner;

public class Song {
	public static void main(String[] args) {
		for(int i = 0; i < 12; i++) {
			if( i == 4 )
				System.out.print("\n");
			else if( i < 9 )
				System.out.print("Na ");
			else if( i > 8 ) {
				if( i == 9 )
					System.out.println();
				System.out.print("Hey ");
			}
			if( i == 11 )
				System.out.println("\nGoodbye!");
		}		
	}
}	
