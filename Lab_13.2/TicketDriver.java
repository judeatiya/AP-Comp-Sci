public class TicketDriver {
	public static void main(String[] args) {
		//Subclasses of Ticket
		Advanced PromLate = new Advanced(5);
		Advanced PromEarly = new Advanced(11);

		StudentAdvance Jude = new StudentAdvance();
		WalkUp Principal = new WalkUp();
		
		System.out.println("Less than 10 days late\n" + PromLate.toString());
		System.out.println("\nMore than 10 days early\n" + PromEarly.toString());
		System.out.println("\nStudent purchase\n" + Jude.toString());
		System.out.println("\nWalk up\n" + Principal.toString());
	}
}
