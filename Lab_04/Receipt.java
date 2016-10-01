import java.util.Scanner;

public class Receipt {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1: ");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price: ");  
		double price1 = keyboard.nextDouble();
		
		System.out.println("Please enter item 2: ");
		String item2 = keyboard.nextLine();
		item2 = keyboard.nextLine();
		System.out.println("Please enter the price: ");  
		double price2 = keyboard.nextDouble();
		
		System.out.println("Please enter item 3: ");
		String item3 = keyboard.nextLine();
		item3 = keyboard.nextLine();
		System.out.println("Please enter the price: ");  
		double price3 = keyboard.nextDouble();
		
		System.out.println("\n\n<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n\n");
		printItem(item1, price1);
		printItem(item2, price2);
		printItem(item3, price3);
		System.out.println("\n");
		printItem("Subtotal", price1 + price2 + price3);
		printItem("Tax", (price1 + price2 + price3)*0.10);
		printItem("Total", price1 + price2 + price3 +((price1 + price2 + price3)*0.10));
		System.out.println("__________________________________________\n* "
							+ "Thank you for your support *");

		
		/**
		
		*        Subtotal: ........      9.01
		*             Tax: ........      0.63
		*           Total: ........      9.64
		__________________________________________
		 * Thank you for your support *
		 
		 **/
	}

	public static void printItem(String s1, double price) {
		System.out.printf("* %15s .......    %10.2f\n", s1, price);
	}
}
