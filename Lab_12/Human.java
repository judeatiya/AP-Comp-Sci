
public class Human {
	private String hair;
	private String eyes;
	private String skin;
	
	public Human() {
		super();
	}

	public Human(String hair, String eyes, String skin) {
		super();
		this.hair = hair;
		this.eyes = eyes;
		this.skin = skin;
	}

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}
	
	public void setHuman(String hair, String eyes, String skin) {
		this.hair = hair;
		this.eyes = eyes;
		this.skin = skin;
	}
}
