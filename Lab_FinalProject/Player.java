public class Player {
	protected int moneyLeft = 0;

	//Constructor
	public Player(int moneyLeft) {
		super();
		this.moneyLeft = moneyLeft;
	}
	
	public Player() {
		super();
		this.moneyLeft = 3;
	}
	
	//Get method
	public int getMoneyLeft() {
		return moneyLeft;
	}

	//Set method
	public void setMoneyLeft(int moneyLeft) {
		this.moneyLeft = moneyLeft;
	}

	@Override
	public String toString() {
		return "" + moneyLeft;
	}	
}
