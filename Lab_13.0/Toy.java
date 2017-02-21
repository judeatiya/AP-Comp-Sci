public abstract class Toy 
{
	private String name;
	private int count;
	
	public Toy() {
		//super();
		count++;
	}

	public Toy(String name) {
		super();
		this.name = name;
		count++;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public void incrementCount() {
		this.count = count + 1;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", count=" + count + "]";
	}
	
	//Abstract method to override in lower subclasses.
	public abstract String getType();
}
