import java.util.Random;

public class GameSystem {
	
	//Class variables
	private String platForm;
	private int serialNumber;
	
	Random rand = new Random();
	
	public GameSystem(String platForm, int serialNumber) {
		this.platForm = platForm;
		this.serialNumber = rand.nextInt(9000000-1)+1000000;
	}

	public GameSystem(String p) {
		this.platForm = p;
		this.serialNumber = rand.nextInt(9000000-1)+1000000;
	}

	public GameSystem() {
		this.serialNumber = rand.nextInt(9000000-1)+1000000;
	}

	public String getPlatForm() {
		return platForm;
	}

	public void setPlatForm(String platForm) {
		this.platForm = platForm;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "GameSystem: " + platForm + 
				"\nserialNumber: " + serialNumber;
	}
	
	
}
