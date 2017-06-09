public class Game {
	
	private Player[] playerArray;
	private boolean gameWon;

	public Game(Player[] playerArray, boolean gameWon) {
		super();
		this.playerArray = playerArray;
		this.gameWon = false;
	}

	public Game(boolean gameWon) {
		super();
		this.gameWon = false;
	}
	
	public Game() {
		super();
		gameWon = false;
	}

	public Player[] getPlayerArray() {
		return playerArray;
	}


	public void setPlayerArray(Player[] playerArray) {
		this.playerArray = playerArray;
	}


	public boolean getGameWon() {
		return gameWon;
	}

	public void setGameWon(boolean gameWon) {
		this.gameWon = gameWon;
	}
	
	public static boolean checkGameWon(Player[] playerArray) {
		int broke = 0;
		
		for(int i = 0; i < 4; ++i) {
			if(playerArray[i].getMoneyLeft() == 0) 
				broke++;
		}
		
		if(broke >= 3)
			return true;
		else
			return false;
	}
	
	public static Player findTheWinner(Player[] playerArray) {
		int i = 0;
		
		for(; i < 4; ++i) {
			if(playerArray[i].getMoneyLeft() != 0) 
				break;
		}
		
		return playerArray[i];
	}
}
