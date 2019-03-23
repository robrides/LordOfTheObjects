package LordOfTheObjects;

import java.util.Arrays;

public class GatherEnemies {

	private Enemy[] enemies;
	private static int MAX_ENEMIES = 3;
	private int numEnemies;

	{
		enemies = new Enemy[MAX_ENEMIES];
	}

	public GatherEnemies() {

	}

	public Enemy[] getEnemies() {

		Enemy[] enemiesCopy = new Enemy[this.numEnemies];
		for (int i = 0; i < this.numEnemies; i++) {
			if (this.enemies != null) {
				enemiesCopy[i] = this.enemies[i];
			}
		}
		return enemiesCopy;
	}

	public void setEnemies(Enemy[] enemies) {
		this.numEnemies = 0;
		this.enemies = enemies;
	}

	public void addEnemy(Enemy enemy) {

		// System.out.println(numEnemies);
		if (numEnemies == MAX_ENEMIES) {
			System.out.println("You already have three enemies.");
		} else {
			for (int i = 0; i < enemies.length; i++) {
				if (enemies[i] == null) {
					enemies[i] = enemy;
					numEnemies++;
					// System.out.println(enemies[i] + "\nis assigned in spot: " + (i + 1) + "\n");
					break;
				}
			}
		}

	}

	public String toString() {
		return "Enemies: " + Arrays.toString(enemies);
	}

}
