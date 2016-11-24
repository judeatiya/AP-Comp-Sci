import java.util.Scanner;

public class TreeDeg60 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);	
		
		System.out.println("Please enter a word: ");
		String str = kb.nextLine();
		
		tree(str, 0, str.length());
	}
	
	public static void tree(String word, int start, int stop) {
		if ( start <= stop ) {
			System.out.printf("%10s \n", word.substring(0, start));
			start++;
			tree(word,start,stop);
		}
	}
}
