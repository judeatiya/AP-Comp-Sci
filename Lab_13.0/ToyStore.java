import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore {
	//Dynamic ArrayList
	ArrayList<Toy> toyList = new ArrayList<Toy>();

	public ToyStore() {
		super();
	}

	public ToyStore(String list) {
		loadToys(list);
	}
	
	public void loadToys(String list) {
		ArrayList<String>toys = new ArrayList<>
		( Arrays.asList(list.split(", ")) );
		
		for(int i = 0; i < toys.size(); i = i+2) {
			//New different toy add to ToyList
			if( getThatToy(toys.get(i)) == null ) {
				//Add Car to toyList
				if(toys.get(i+1).equals("Car"))
					toyList.add( new Car(toys.get(i)) );
				//Add AF to toyList
				else
					toyList.add( new AFigure(toys.get(i)) );
			}
			else {
				getThatToy(toys.get(i)).incrementCount();
			}
		}

	}
	
	public Toy getThatToy(String name) {
		Toy retObject = null;
		
		for(Toy toy : toyList) {
			if(toy.getName().equals(name)) {
				retObject = toy;
				break;
			}
			else
				retObject = null;
		}
		
		return retObject;
	}
	
	public String getMostFrequentToy() {
		String name = "";
		int max = 0;
		
		for(Toy toy : toyList) {
			if( max < toy.getCount() ) {
				max = toy.getCount();
				name = toy.getName();
			}
		}
		
		return name;
	}
	
	public String getMostFrequentType() {
		int cars = 0;
		int af = 0;
		
		//advance for loop
		for(Toy toy : toyList) {
			//Check toy for is-a relationship
			if(toy instanceof Car)
				cars++;
			else
				af++;
		}
		
		if(cars > af)
			return "Cars";
		else if (af > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}

	@Override
	public String toString() {
		String retString = "";
		
		for(Toy toy : toyList)
			retString = retString + toy.toString() + ", ";
		
		return retString;
	}
}