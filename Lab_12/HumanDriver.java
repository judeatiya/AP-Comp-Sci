import java.util.Scanner;

public class HumanDriver {
	public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter hair color: ");
		String hair = kb.nextLine();
		
		System.out.println("Please enter eye color: ");
		String eye = kb.nextLine();
		
		System.out.println("Please enter skin color: ");
		String skin = kb.nextLine();
				
		Human clone1 = new Human(hair, eye, skin);
		
		System.out.println("My info......");
		System.out.println("Hair:\t" + clone1.getHair());
		System.out.println("Eyes:\t" + clone1.getEyes());
		System.out.println("Skin:\t" + clone1.getSkin());
		
		clone1.setEyes("Yellow");
		clone1.setHair("Blue");
		clone1.setSkin("Hairy");
		
		System.out.println("\nFriend's info......");
		System.out.println("Hair:\t" + clone1.getHair());
		System.out.println("Eyes:\t" + clone1.getEyes());
		System.out.println("Skin:\t" + clone1.getSkin());
	}
}
