public class Advanced extends Ticket {

	private int daysLeft;
	
	//Constructor
	public Advanced(int daysLeft) {
		super();
		this.daysLeft = daysLeft;
	}

	//Get and Set methods
	public int getDaysLeft() {
		return daysLeft;
	}

	public void setDaysLeft(int daysLeft) {
		this.daysLeft = daysLeft;
	}

	@Override
	public double getPrice() {
		if(daysLeft >= 10)
			return 30.00;
		else
			return 40.00;
	}
}
