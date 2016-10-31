import java.util.Scanner;

public class AdventureGame {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Its the Vietnam War. Do you want to enlist or go rogue?");
		String enlist = kb.nextLine();
		
		if(enlist.equals("enlist")) {
			System.out.println("You are drafted by Uncle Sam!");
			System.out.println("Do you want to be in the Marines or Army?");
			String soldierType = kb.nextLine();

			if(soldierType.equals("Marines")) {
				System.out.println("You are now a Marine Recon.");
				System.out.println("Do you want to stay on \"base\" or go in the \"jungle\"?");
				String stay = kb.nextLine();
				
				if(stay.equals("stay"))
					System.out.println("You got snipe by the VietCong and you die!");
				else 
					System.out.println("The Airforce sprayed you with Agent Orange"
							+ "and you become Donald Trump and now run for president!");
			}
			else {
				System.out.println("You are in the Army.");
				System.out.println("Do you want to fly the helicopter or work as a medic?");
				String fly = kb.nextLine();
				
				if(fly.equals("helicopter")) {
					System.out.println("You are a great pilot and rescued Forrest Gump!");
				}
				else
					System.out.println("You became a great medic, and married Margaret.");
			}
			
		}
		else {
			System.out.println("You have gone rogue! You are now VietCong!");
			System.out.println("You are a charlie!");
			System.out.println("Do you want to be a sniper or an assassin?");
			String sneaky = kb.nextLine();
			
			if(sneaky.equals("sniper")) {
				System.out.println("You shot a brigadier general!");
				System.out.println("You became famous. Do you want the Chinese or Russisans to help you?");
				String friendOrFoe = kb.nextLine();
			
				if(friendOrFoe.equals("Chinese")) {
					System.out.println("The Chinese do not trust you, so they kill you anyways");
				}
				else
					System.out.println("The Russians taken over your country and now you are "
										+ "in a concentration camp!");
			}
			else {
				System.out.println("You are now an assassin!");
				System.out.println("Do you want a knife or an AK-47?");
				String weapon = kb.nextLine();
				
				if(weapon.equals("knife")) {
					System.out.println("You have a knife. You decide to fight at night");
					System.out.println("You got caputred by the Khmer Rouge and died!");
				}
				else {
					System.out.println("You have an AK-47, and now have to do guerrilla warfare.");
					System.out.println("But instead the VietCong made you dig tunnels and you die of malaria!");
				}
			}		
		}		
	}
}
