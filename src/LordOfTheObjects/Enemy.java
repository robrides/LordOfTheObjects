package LordOfTheObjects;

public class Enemy extends GameCharacter{

	private int attackEffect;
	private String[] enemy;
	
	
	public Enemy(String name, int health) {
		super(name, health);
		// TODO Auto-generated constructor stub
	}


	public int enemyAttack() {
		
		
		return 0;
	}


	public int getAttackEffect() {
		return attackEffect;
	}


	public void setAttackEffect(int attackEffect) {
		this.attackEffect = attackEffect;
	}


	public String[] getEnemy() {
		return enemy;
	}


	public void setEnemy(String[] enemy) {
		this.enemy = enemy;
	}
	
	
	
}
