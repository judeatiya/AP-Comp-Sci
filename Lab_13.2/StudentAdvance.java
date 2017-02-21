
public class StudentAdvance extends Ticket {

	@Override
	public double getPrice() {
		return 25.00;
	}

	public String toString() {
		return 	"Ticket: " + this.getSerialNo() + 
				"\nPrice: " + getPrice() +
				" (STUDENT ID REQUIRED)";
	}
}
