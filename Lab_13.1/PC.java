
public class PC extends GameSystem{
	
	private String devices;
	
	public PC(String string) {
		super(string);
	}

	public String getSystemInput() {
		return "Keyboard and Mouse";
	}
	
	@Override
	public String toString() {
		return 	"PlatForm: " + getPlatForm() +
				"\nSerial #: " + getSerialNumber() +
				"\nSystem Input: " + getSystemInput();
	}

}
