public class ToyRunner {
	public static void main(String[] args) {
		ToyStore AntonToyStore1 = new ToyStore("Tacoma, Car");
		
		System.out.println(AntonToyStore1.toString());
		
		ToyStore AntonToyStore2 = 
				new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, "
							+ "Car, Matchbox, Car, Star Wars, "
							+ "AF, Pullback, Car, Star Wars, AF");
		
		System.out.println("\nList...");
		System.out.println("Hotwheel, Car, G.I.Joe, AF, PennyRacer, "
							+ "Car, Matchbox, Car, Star Wars, "
							+ "AF, Pullback, Car, Star Wars, AF");
		System.out.println(AntonToyStore2.toString());
		
		System.out.println("\nMost Frequent Toy in Store2: " 
							+ AntonToyStore2.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy in Store2: " 
							+ AntonToyStore2.getMostFrequentType());
		
	}
}