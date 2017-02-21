public class Car extends Toy
{
	public Car() {
		super();
	}

	public Car(String name) {
		super(name);
	}

	@Override
	public String getType() {
		return "Car";
	}
}