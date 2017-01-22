import java.util.Scanner;

public class GameHealth {
	public static String[] health;
	public static int HEALTHLOAD = 6;
	public static int healthCount;
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while( !(turn.equals("Q")) && healthCount > 0 ) {
			System.out.println("Your turn! Hit enter when ready: ");
			turn = kb.nextLine();
			
			damage = (int)(Math.random()*(2-1+1)) + 1;
			amount = (int)(Math.random()*(6-1+1)) + 1;
			
			System.out.println("" + takeDamage(damage, amount));
			System.out.println("" + printClip());
		}
		
		System.out.println("You died!!!");
	}
	
	public static String takeDamage(int dmg, int amt) {
		if(dmg == 1) {
			healthCount = healthCount - amt;
			
			return "Taking " + amt + " damage!";
		}
		else if(healthCount + amt < HEALTHLOAD) {
			healthCount = healthCount + amt;
		}
		else
			healthCount = HEALTHLOAD;
		
		return "Power Up " + amt + "!";
	}
	
	public static String printClip() {
		String output = "Health:\t";
		
		for(int i = 0; i < HEALTHLOAD; ++i) {
			if(i < healthCount)
				health[i] = " @ ";
			else
				health[i] = "[]";
			
			output = output + health[i];
		}
		
		return output;
	}
}
