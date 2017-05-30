public class Pot {
	protected int moneyInPot;

	public Pot() {
		super();
	}

	public Pot(int moneyInPot) {
		super();
		this.moneyInPot = moneyInPot;
	}

	public int getMoneyInPot() {
		return moneyInPot;
	}

	public void setMoneyInPot(int moneyInPot) {
		this.moneyInPot = moneyInPot;
	}

	@Override
	public String toString() {
		return "" + moneyInPot;
	}
}
