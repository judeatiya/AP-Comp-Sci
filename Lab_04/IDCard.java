import java.util.Scanner;

public class IDCard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:  ");
		String nameFirst = keyboard.nextLine();
		System.out.println("Enter your last name: ");  
		String nameLast = keyboard.nextLine();
		
		System.out.println("Enter your title: ");
		String title = keyboard.nextLine();
		System.out.println("Enter the school site: ");  
		String school = keyboard.nextLine();
		
		System.out.println("Enter the school year: ");
		String year = keyboard.nextLine();
		System.out.println("What is your subject? ");  
		String subject = keyboard.nextLine();
		
		System.out.println("***********************************");
		
		IDCard newPerson = new IDCard();
		
		newPerson.outputID(school, year);
		newPerson.outputID(nameFirst, nameLast);
		newPerson.outputID(title, subject);
		
		System.out.println("***********************************");


		
		/**
		***********************************
		*  Torrey Pines           2016-17 *
		*       Richard         Robinette *
		*       Teacher  Computer Science *
		***********************************
		*/
	}
	
	public void outputID(String s1, String s2){
		System.out.printf("* %15s %15s *\n", s1, s2);
	}
}
