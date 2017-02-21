
public class PlayStation extends Console {

	public PlayStation(String string) {
		super(string);
	}

	@Override
	public String getController() {
		return "PS DualShock 3";
	}
	
	public String getPlatForm() {
		return "PlayStation";
	}
}
