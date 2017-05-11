/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank1 = {"Jack", "Queen", "King"};
		String[] suit1 = {"Hearts", "Spades", "Diamonds"};
		int[] value1 = {11, 12, 13};
	    Deck deck1 = new Deck(rank1, suit1, value1);
	    System.out.println("Deck1 size should be 3: " + deck1.size());
	    
	    String[] rank2 = {"10", "Queen", "King"};
	    String[] suit2 = {"Clubs", "Spades", "Diamonds"};
	    int[] value2 = {10, 12, 13};
	    Deck deck2 = new Deck(rank2, suit2, value2);
	    System.out.println("Deck2 should not be empty: " + !deck2.isEmpty());
	    
	    String[] rank3 = {"1", "3", "Queen"};
	    String[] suit3 = {"Diamonds", "Spades", "Hearts"};
	    int[] value3 = {1, 3, 12};
	    Deck deck3 = new Deck(rank3, suit3, value3);
	    System.out.println("Deck3 dealt card is: " + deck3.deal());
	    
	    System.out.println("**** Shuffle card****");
	    
        String[] ranks2 = new String[52];
        String[] suits2 = new String[52];
        int[] pointValues2 = new int[52];
        
        for (int i = 0; i < 52; i++) {
            String rank = "";
            String suit = "";
            if ( (i+1) % 13 == 11 ) {
                rank = "Jack";
            }
            else if ( (i+1) % 13 == 12 ) {
                rank = "Queen";
            }
            else if ( (i+1) % 13 == 0 ) {
                rank = "King";
            }
            else if ( (i+1) % 13 == 1 ) {
                rank = "Ace";
            }
            else {
                rank = Integer.toString((i + 1) % 13);
            }
            
            if (i < 13) {
                suit = "Hearts";
            }
            else if (i < 26) {
                suit = "Diamonds";
            }
            else if (i < 39) { 
                suit = "Clubs";
            }
            else {
                suit = "Spades";
            }
            
            ranks2[i] = rank;
            suits2[i] = suit;
            pointValues2[i] = ((i+1) % 13);
        }
        
        Deck e = new Deck(ranks2, suits2, pointValues2);
        System.out.println(e);
	}
}