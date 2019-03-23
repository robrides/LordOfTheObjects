package LordOfTheObjects;

public class GameCharacter {

	private String name;
	private int health;
	private final int MAX_HEALTH = 100;
	
	
	
	public GameCharacter(String name, int health) {
		this.name = name;
		this.health = health;
	}

	public void takeDamage(int amt) {
		// take damage and return int for health left
		this.health = this.health - amt;
	}

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
