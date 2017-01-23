public class MilesPerHour {
	private int distance;
	private int hours;
	private int minutes;
	private double mph;
	
	public MilesPerHour() {
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}

	public MilesPerHour(int distance, int hours, int minutes) {
		super();
		this.distance = distance;
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public double getMph() {
		return mph = Math.round(distance/(hours+minutes/60.0));
	}

	public void setMph(double mph) {
		this.mph = mph;
	}
}