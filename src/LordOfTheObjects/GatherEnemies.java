package LordOfTheObjects;

public class GatherEnemies {

	private Enemy[] enemies;
	private static int MAX_ENEMIES = 3;
	private int numEnemies;

	// Instantiate an Enemy array
	{
		enemies = new Enemy[MAX_ENEMIES];
	}

	// GatherEnemies no-Args constructor
	public GatherEnemies() {

	}

	// Setter and getter
	public void setEnemies(Enemy[] enemies) {
		this.numEnemies = 0;
		this.enemies = enemies;
	}

	// Gather enemies in an array copy
	public Enemy[] getEnemies() {

		Enemy[] enemiesCopy = new Enemy[this.numEnemies];
		for (int i = 0; i < this.numEnemies; i++) {
			if (this.enemies != null) {
				enemiesCopy[i] = this.enemies[i];
			}
		}
		return enemiesCopy;
	}

	// Add enemies
	public void addEnemy(Enemy enemy) {

		if (numEnemies == MAX_ENEMIES) {
			System.out.println("You already have max enemies.");
		} else {
			for (int i = 0; i < enemies.length; i++) {
				if (enemies[i] == null) {
					enemies[i] = enemy;
					numEnemies++;
					break;
				}
			}
		}

	}

	public String toString() {
		String enemies = "Your opponents...\n";
		
		for (int i = 0; i < this.enemies.length; i++) {
			enemies += (this.enemies[i].getName()) + "\n";
		}
		
		return enemies;
	}

}
