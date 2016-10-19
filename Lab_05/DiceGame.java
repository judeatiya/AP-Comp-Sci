public class DiceGame 
{
	public int result = 0;
	
	public static void main(String[]args) {
		DiceGame player = new DiceGame();
		DiceGame computer = new DiceGame();
		
		player.diceRoll();
		computer.diceRoll();
				
		System.out.println("You rolled a " + player.result);
		System.out.println("Computer rolled a " + computer.result);
		
		if(player.result > computer.result)
			System.out.println("And the winner is the player.");
		else if(player.result < computer.result)
			System.out.println("And the winner is the computer.");
		else
			System.out.println("No winner. Game is a tie.");
	}
	
	public int diceRoll() {
		return result = (int)(Math.random()*6)+1;
	}
}
