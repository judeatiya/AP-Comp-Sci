import java.util.Scanner;

public class GameGun {
	public static int bulletCount = 96;
	public static int CLIPSIZE = 16;
	public static int shotCount = 0;
	public static String clip[] = new String[CLIPSIZE];
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String action = "";
		
		resetClip(clip);
		
		while(bulletCount > 0 && shotCount <= 16) {
			System.out.print("Action - 'R' = reload or 'S' = shoot: ");
			action = kb.nextLine();
			
			if(action.equals("R")) {
				reLoad();
			}
			else if(action.equals("S")) {
				shoot();
			}
			
			System.out.println("" + printClip());
		}
		
		System.out.println("Out of Bullets!!!");
	}
	
	public static void resetClip(String[] clip) {
		for(int i = 0; i < clip.length; ++i) {
			clip[i] = "[] ";
		}	
	}
	
	public static void shoot() {
		if(shotCount < CLIPSIZE) {
			clip[shotCount] = "* "; // '*' bullet fired, '[]' = bullet left.
			shotCount++;
			bulletCount--;
			
			System.out.println("Boom!!!");
		}
		else
			System.out.println("\n*** You need to ReLoad!!! ***");
	}
	
	public static void reLoad() {
		if(bulletCount <= 96)
			shotCount = 0;
		
		resetClip(clip);
	}
	
	public static String printClip() {
		String retValueStr = "Bullets: \t" + bulletCount + 
							"\n" + "Clip:\t";
		for(int i = 0; i < CLIPSIZE; ++i)
			retValueStr = retValueStr + clip[i];
		
		return retValueStr;
	}
}
