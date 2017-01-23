import java.util.Scanner;

public class User {
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public User() {
		super();
		
		this.firstName = "";
		this.lastName = "";
		this.avatar = "";
		this.userID = 007;
	}

	public User(String fN, String lN) {
	   firstName = fN;
	   lastName = lN;
	   avatar = "Undefined";
	   userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av) {
	   firstName = fN;
	   lastName = lN;
	   avatar = av;
	   userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString() {
	   return "Customer Info...\nFirst Name: " + firstName +
	                           "\nLast Name: " + lastName +
	                           "\nAvatar: " + avatar +
	                           "\nUser ID#: " + userID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		User person;
		
		System.out.println("Please enter first name: ");
		String fn = kb.nextLine();
		
		System.out.println("Please enter last name: ");
		String ln = kb.nextLine();
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		String choice = kb.nextLine();
		
		if(choice.equals("y")) {
			System.out.println("Please enter an avatar: ");
			String av = kb.nextLine();
			
			person = new User(fn,ln, av);
		}
		else {
			person = new User(fn, ln);
		}
		
		System.out.println(person.toString());
	}
}
