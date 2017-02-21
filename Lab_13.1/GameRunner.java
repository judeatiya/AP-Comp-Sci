
public class GameRunner {
	public static void main(String[] args) {
		
		//Root Class
		GameSystem IBM = new GameSystem("Watson");
		
		//Subclasses from Abstract Console class
		PlayStation Sony = new PlayStation("SonyPS");
		XBox Gates = new XBox("MicroSoft");
		
		//Subclass of GameSystem
		PC StarCraft = new PC("Blizzrd");
		
		System.out.println(IBM.toString());
		System.out.println("\n" + Sony.toString());
		System.out.println("\n" + Gates.toString());
		System.out.println("\n" + StarCraft.toString());
	}
}
