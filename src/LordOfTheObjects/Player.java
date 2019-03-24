package LordOfTheObjects;

public class Player extends GameCharacter {

	private String bandName;

	// Player constructor
	public Player(String name, int health, String bandName) {
		super(name, health);
		this.bandName = bandName;
	}
	
	
	// Getters and setters
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
