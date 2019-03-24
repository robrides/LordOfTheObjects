package LordOfTheObjects;

public class Player extends GameCharacter {

	private String bandName;

	public Player(String name, int health, String bandName) {
		super(name, health);
		// TODO Auto-generated constructor stub
		this.bandName = bandName;
	}
	
	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public String toString() {
		return "Player: " + this.getName() + ", Band: " + this.getBandName() + ", Current Health: " + this.getHealth();
	}
	
}
