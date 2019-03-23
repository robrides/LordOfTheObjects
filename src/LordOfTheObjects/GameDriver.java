package LordOfTheObjects;

import java.util.Scanner;

public class GameDriver {

	// Instantiate and setup GatherEnemies
	private GatherEnemies enemies = new GatherEnemies();
	// Instantiate and setup GatherEnemies
	private String playerName;
	private String bandName;
	
	public static Scanner kb = new Scanner(System.in);
	// instantiate player
	// instantiate enemies
	// death scenarios and random output of a few
	// establish achievement method
	// game play method to interact with other methods

	public void printIntro() {

		System.out.println("Welcome .....");
		// back story
		System.out.println("Backstory");

	}

	public void gameInitialization() {

		// Instantiate and setup enemies
		Enemy enemy1 = new Enemy("Joe the junkie", 10, 100, "Scenario1", "Scenario2", "Scenario3");
		Enemy enemy2 = new Enemy("CRAZED Fan!!!", 10, 100, "Scenario1", "Scenario2", "Scenario3");
		Enemy enemy3 = new Enemy("Bo the Bouncer", 10, 100, "Scenario1", "Scenario2", "Scenario3");

		enemies.addEnemy(enemy1);
		enemies.addEnemy(enemy2);
		enemies.addEnemy(enemy3);

		System.out.println(enemies.getEnemies());

	}

	public void playerInitialization(Player player) {

		System.out.println("Please enter your musician name >>");
		playerName = kb.nextLine();

		System.out.println("Please enter your band name >>");
		bandName = kb.nextLine();

		player.toString();

	}

	public void printBackStory() {

		System.out.println("Welcome to Venture to the Venue.\n");

	}

	public void printMusicNotes() {
		System.out.println(
				"\n\u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B\n\u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A\n\u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B");
	}

	public void printStoryLine1() {
		System.out.println("\nYou have just woken up in an alley. Your head is pounding, your clothes are \nwet,"
				+ "and you’ve just realized you are " + playerName + " and your band " + bandName	+ " has a concert across \ntown in 45 minutes. You pick yourself up and start walking toward the street \nwhere you see a corner store. You go in to ask for directions when Joe the junkie \njumps out of nowhere with a broken bottle and tries to attack you! \n\n");

	}
	
	public int getMenuChoice() {
		
		int choice;
		
		do {
			
			System.out.println("Do you : (1. Run) (2. Fight) (3. Quit Game)\n");	
		choice = kb.nextInt();
			
		} while(choice != 1 && choice != 2 && choice != 3);
		
		return choice;
	}
	
	public int fightMethod() {
		// TODO randomize amount of damage for each encounter
		int healthReduction = 0;
		
		enemies.getEnemies();
		System.out.println("Got to the fightMethod");
		return healthReduction;
	}
	
	public int runMethod() {
		int healthReduction = 0;
		
		enemies.getEnemies();
		System.out.println("Got to the runMethod");
		return healthReduction;
	}

	public void playGame() {

		int choice = 0;
		gameInitialization();
		printBackStory();
		Player player = new Player(playerName, 100, bandName);
		playerInitialization(player);
		printMusicNotes();

		do {
			System.out.println("Get ready for adventure...\n\n\n");
			printStoryLine1();
			choice = getMenuChoice();
			if (choice == 2) {
				fightMethod();	
			}
			else if (choice == 3) {
				break;
			}
			

		} while (choice != 3 && (player.getHealth() > 0));

		// Prompt for character name

		// present game menu
		// request options from player

	}

	public int enemyAttack() {

		return 0;
	}

}
