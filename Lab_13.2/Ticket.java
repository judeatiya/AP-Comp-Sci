import java.util.Random;

public abstract class Ticket {
	
	private int serialNo;

	public Ticket() {
		Random rand = new Random();
		this.serialNo = rand.nextInt(9000000-1)+1000000;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	
	//Abstract method only in an abstract class.
	public abstract double getPrice();

	@Override
	public String toString() {
		return 	"Ticket: " + serialNo + 
				"\nPrice: " + getPrice();
	}
}
