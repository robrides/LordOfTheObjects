package LordOfTheObjects;

import java.util.Scanner;

public class GameDriver {
	
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
		Enemy enemy1 = new Enemy("Joe the junkie", 10, 100,
				"Scenario1", "Scenario2", "Scenario3");
		Enemy enemy2 = new Enemy("CRAZED Fan!!!", 10, 100,
				"Scenario1", "Scenario2", "Scenario3");		
		Enemy enemy3 = new Enemy("Bo the Bouncer", 10, 100,
				"Scenario1", "Scenario2", "Scenario3");
		
		// Instantiate and setup GatherEnemies
		GatherEnemies enemies = new GatherEnemies();

		enemies.addEnemy(enemy1);
		enemies.addEnemy(enemy2);
		enemies.addEnemy(enemy3);
		
		System.out.println(enemies.getEnemies());
		
	}
	
	public void playerInitialization() {
		
		String playerName;
		String bandName;
		
		System.out.println("Please enter your musician name >>");
		playerName = kb.nextLine();

		System.out.println("Please enter your band name >>");
		bandName = kb.nextLine();
		
		Player player = new Player(playerName, 100, bandName);
		player.toString();
		
	}
	
	public void printBackStory() {
		
		System.out.println("Welcome to Venture to the Venue.\n");
		
	}
	
	public void printMusicNotes() {
		System.out.println("\n\u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B\n\u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A\n\u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B");
	}
	
	public void playGame(Scanner kb) {
		
		gameInitialization();
		printBackStory();
		playerInitialization();
		printMusicNotes();
		
		
		
		
		
		
		
		
		do {
			
			
			
			
			
			
			
		} while (true);
		
		// Prompt for character name
		
		
		// present game menu
		// request options from player
		
		
	}
	
	public int enemyAttack() {
		
		return 0;
	}

	
	
	
}
