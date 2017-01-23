
public class Car {
	private String paint;
	private String interior;
	private String engine;
	private String tires;
	
	public Car( String paint, String interior, 
				String engine, String tires ) {
		super();
		this.paint = paint;
		this.interior = interior;
		this.engine = engine;
		this.tires = tires;
	}

	public String getPaint() {
		return paint;
	}

	public void setPaint(String paint) {
		this.paint = paint;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTires() {
		return tires;
	}

	public void setTires(String tires) {
		this.tires = tires;
	}
}
