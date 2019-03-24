package LordOfTheObjects;

public class GameCharacter {

	private String name;
	private int health;
	private final int MAX_HEALTH = 100;
	
	
	// Character constructor to be inherited
	public GameCharacter(String name, int health) {
		this.name = name;
		this.health = health;
	}

	// take damage decreasing health
	public void takeDamage(int amt) {
		this.health = this.health - amt;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMAX_HEALTH() {
		return MAX_HEALTH;
	}
	
	
}
