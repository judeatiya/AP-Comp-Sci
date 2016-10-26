import java.util.Scanner;

public class Password {
	
	static String userKey = "Jude";
	static String passwordKey = "Superman101";
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your username: ");
		String name = kb.nextLine();
		
		System.out.println("Please enter your password: ");
		String password = kb.nextLine();
		
		checkPassword(name, password);
	}
	
	public static void checkPassword(String user, String pass) {
		 if ( !userKey.equals(user) && passwordKey.equals(pass) )
			 System.out.println("Your username is incorrect!");
		 else if (!passwordKey.equals(pass) && userKey.equals(user) )
			 System.out.println("Your password is incorrect!");
		 else if (!userKey.equals(user) && !passwordKey.equals(pass) )
			 System.out.println("Your username and password are incorrect!"); 		 
	}
}
