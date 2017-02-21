public abstract class Console extends GameSystem{
	
	private String controller;
	
	public Console(String controller) {
		this.controller = controller;
	}
	
	public Console() {
		// TODO Auto-generated constructor stub
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	//Abstract class returns String
	public abstract String getController();

	@Override
	public String toString() {
		return 	"PlatForm: " + getPlatForm() +
				"\nSerial #: " + getSerialNumber() +
				"\nController: " + this.getController();
	}
}
