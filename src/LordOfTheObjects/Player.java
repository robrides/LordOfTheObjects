package LordOfTheObjects;

public class Player extends GameCharacter {

	private String weapon;

	
	
	public Player(String name, int health) {
		super(name, health);
		// TODO Auto-generated constructor stub
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	
	
}
