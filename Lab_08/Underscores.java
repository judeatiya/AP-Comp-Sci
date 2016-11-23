import java.util.Scanner;

public class Underscores {
	
	public static void main(String[]args){
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Write a sentence that includes spaces: ");
		
		String sentence = kb.nextLine();
		
		System.out.println(replace(sentence, ' ', '_')); }
	
	public static String replace(String str, char blank, char under){	
	
		if( str.length() < 1 )	
			return str;
		else
		{	
			char firstChar = '\0';
		
			if( str.charAt(0) == blank )	
				firstChar = under;
			else
				firstChar = str.charAt(0);	
			
			return firstChar + replace(str.substring(1), blank, under);
		}	
	}
}