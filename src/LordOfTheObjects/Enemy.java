package LordOfTheObjects;

import java.util.Arrays;

public class Enemy extends GameCharacter {

	private int attackEffect;
	private String[] attackScenarios;

	public Enemy(String name, int health, int attackEffect, String... attackScenarios) {
		super(name, health);
		// TODO Auto-generated constructor stub
		this.attackEffect = attackEffect;
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

	public int getAttackEffect() {
		return attackEffect;
	}

	public void setAttackEffect(int attackEffect) {
		this.attackEffect = attackEffect;
	}

	public String toString() {
		return "Enemy: " + this.getName() + ", Attack Effect: " +  this.getAttackEffect() + "\nAttack Scenarios: " + Arrays.toString(attackScenarios);
	}

}
