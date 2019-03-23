package LordOfTheObjects;

import java.util.Arrays;

public class Enemy extends GameCharacter {

	private String[] attackScenarios;

	public Enemy(String name, int health, String... attackScenarios) {
		super(name, health);
		// TODO Auto-generated constructor stub
		this.attackScenarios = attackScenarios;

	}

	public String getAttackScenarios(int attackScenario) {
		String result;
		result = this.attackScenarios[attackScenario];
		return result;
	}

	public void setAttackScenarios(String[] attackScenarios) {
		this.attackScenarios = attackScenarios;
	}

	public String toString() {
		return "Enemy: " + this.getName() + "\nAttack Scenarios: " + Arrays.toString(attackScenarios);
	}

}
