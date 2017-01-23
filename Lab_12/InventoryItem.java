import java.util.Scanner;

public class InventoryItem {
	public String Manufacturer;
	public String name;
	public String category;
	public int UPC;
	public double price;
	
	public InventoryItem(String Manufacturer, String name) {
		this.Manufacturer = Manufacturer;
		this.name = name;
		UPC = (int)(Math.random() * 1000000) + 1;
		this.category = "none";
		this.price = 0.00;
	}
	
	public InventoryItem(String manufacturer, String name, String category, double price) {
		super();
		Manufacturer = manufacturer;
		this.name = name;
		this.category = category;
		UPC = (int)(Math.random() * 1000000) + 1;
		this.price = price;
	}

	public String getManufacturer() {
		return Manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getUPC() {
		return UPC;
	}
	
	public void setUPC(int uPC) {
		UPC = uPC;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return 	"InventoryItem \nManufacturer:\t" + Manufacturer + "\nname: \t\t" + name + 
				"\ncategory:\t" + category + "\nUPC:\t\t" + UPC + "\nprice: \t\t" + price;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		InventoryItem item1;
		
		System.out.println("Please enter manufactuer: ");
		String make = kb.nextLine();
		
		System.out.println("Please enter item's name: ");
		String model = kb.nextLine();
		
		System.out.println("Would you like enter category and price? (y or n)");
		String choice = kb.nextLine();
		
		if(choice.equals("y")) {
			System.out.println("Please enter category: ");
			String dept = kb.nextLine();
			
			System.out.println("Please enter price: ");
			Double cost = kb.nextDouble();
			
			item1 = new InventoryItem(make, model, dept, cost);
		}
		else
			item1 = new InventoryItem(make, model);
		
		System.out.println(item1.toString());
	}
}
