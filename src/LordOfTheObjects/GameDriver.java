package LordOfTheObjects;

import java.util.Scanner;

public class GameDriver {

	// Instantiate and setup GatherEnemies
	private Player player;
	private GatherEnemies enemies;
	// Instantiate and setup GatherEnemies
	private String playerName;
	private String bandName;
	private int choice;
	private int story;

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
		enemies = new GatherEnemies();
		Enemy enemy1 = new Enemy("Joe the junkie", 10, 100,
				"You pick up a slim jim and hit the junkie over the head \n-10 health to junkie\nThe junkie lunges at you and cuts your arm \n-10 health to "
						+ playerName + "\n",
				"You throw a box of tampons and hit the junkie in the eye \n-20 health to junkie\n"
						+ "The junkie throws the broken bottle at you and hits you in the head \n-10 health to "
						+ playerName + "\n",
				"You find a fire extinguisher and knock the junkie out \n-30 health to junkie\nThe junkie dies.",
				"The junkie chased after you and stabbed you with the broken bottle, you \nimmediately contract AIDS and die. \nGame Over.");
		Enemy enemy2 = new Enemy("CRAZED Fan!!!", 10, 100,
				"You give the fan an autograph \n-10 health to fan\n"
						+ "The fan tells you they will scream louder if you don’t let them back-stage \n-10 health to "
						+ playerName,
				"You give them back-stage passes and beg them not to cause a scene \n-20 health to fan\n"
						+ "The fan is still not satisfied and insists on meeting the rest of the band \n-20 health to "
						+ playerName,
				"You agree to let the fan come with you to meet the band.\n-30 health to fan\nThey immediately have a heart attack from pure excitement and die.",
				"The crazed fan’s outburst drew everyone's attention towards you and a mob is formed. \nYou try to outrun them, but are no match for the hundreds of people barreling towards \nyou and you are trampled to death by your own fans. \nGame Over.");
		Enemy enemy3 = new Enemy("Bo the Bouncer", 10, 100,
				"You kick him square in the nuts \n-20 health to bouncer\n"
						+ "He drops you and you land on your ankle funny \n-10 health to " + playerName,
				"You dig a big piece of glass out of your arm from when the junkie attacked \nyou and use it to slice open a large gash on the bouncers face \n-30 health to bouncer\n"
						+ "The bouncer back hands you right in the jaw \n-20 health to " + playerName,
				"One of your bandmates spots you and throws you a guitar, you beat the bouncer with it \n-50 health to bouncer\nThe bouncer dies from his wounds",
				"The bouncer throws you out onto the sidewalk. Some millennials on motorized scooters \nare too busy hitting their Juuls to realise you are laying in their path. They run \nover your neck which snaps you die instantly. \nGame Over.");

		enemies.addEnemy(enemy1);
		enemies.addEnemy(enemy2);
		enemies.addEnemy(enemy3);
	}

	public void playerInitialization(Player player) {

		System.out.println("Please enter your musician name >>");
		playerName = kb.nextLine();

		System.out.println("Please enter your band name >>");
		bandName = kb.nextLine();
		player.setHealth(100);
		System.out.println(player.toString());

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
				+ "and you’ve just realized you are " + playerName + " and your band " + bandName
				+ " has a concert across \ntown in 45 minutes. You pick yourself up and start walking toward the street \nwhere you see a corner store. You go in to ask for directions when Joe the junkie \njumps out of nowhere with a broken bottle and tries to attack you! \n\n");

	}

	public void printStoryLine2() {

		System.out.println(
				"You sprint out of the corner store and down Main Street for a few blocks. \nBloody, bruised, and wet, you make your way towards the venue when you \nrealize it’s 2019 and you can totally just call an Uber. The uber arrives \nand takes you close to the venue, but the road is blocked off so you have \nto walk the rest of the way. All of the sudden a CRAZED fan yells “Is that \n"
						+ playerName + " from " + bandName + " and starts booking it towards you.\n");
	}

	public void printStoryLine3() {

		System.out.println(
				"You run away before anyone notices and you go towards the back entrance of the venue. \nYou realized that somewhere along the way you lost your band member backstage pass \nand now you have no way of getting in. You walk up to the bouncer and tell him you are \nwith the band and he laughs in your face. He asks for your pass and when you tell him \nyou lost it, he picks you up and tries to throw you.\n");
	}

	public void printWinStory() {

		System.out.println(
				"You finally make it into the venue and your venture is over. You go on to have the \nperformance of a lifetime and get signed by “The Big Record Label.” You join the \nilluminati who hides the 3 deaths you were responsible for and you become supreme \noverload of the music industry. You live happily ever after and never die because \nyou sold your soul to the devil. \nThe End.");

	}

	public int getMenuChoice() {

		int choice;

		do {

			System.out.println("Do you : (1. Run) (2. Fight) (3. Quit Game)\n");
			choice = kb.nextInt();

		} while (choice != 1 && choice != 2 && choice != 3);

		return choice;
	}

	public void fightMethod() {
		// TODO randomize amount of damage for each encounter
		int healthReduction = 0;

		if (story == 1) {
			for (int i = 0; i < 3; i++) {
				System.out.println(enemies.getEnemies()[0].getAttackScenarios(i));
				healthReduction = (int) (Math.random() * 10);
				System.out.println(healthReduction + " in health reducation\n");
				player.takeDamage(healthReduction);
				System.out.println("\nCurrent health: " + player.getHealth());
				menuMethod();
			}
		} else if (story == 2) {
			for (int i = 0; i < 3; i++) {
				System.out.println(enemies.getEnemies()[1].getAttackScenarios(i));
				healthReduction = (int) (Math.random() * 10);
				System.out.println(healthReduction + " in health reducation\n");
				player.takeDamage(healthReduction);
				System.out.println("\nCurrent health: " + player.getHealth());
				menuMethod();
			}
		} else if (story == 3) {
			for (int i = 0; i < 3; i++) {
				System.out.println(enemies.getEnemies()[2].getAttackScenarios(i));
				healthReduction = (int) (Math.random() * 10);
				System.out.println(healthReduction + " in health reducation\n");
				player.takeDamage(healthReduction);
				System.out.println("\nCurrent health: " + player.getHealth());
				menuMethod();
			}
		}
	}

	public int runMethod() {
		int healthReduction = 0;

		System.out.println(enemies.getEnemies()[story]);
		System.out.println("Got to the runMethod");
		return healthReduction;
	}

	public void menuMethod() {

		choice = getMenuChoice();
		if (player.getHealth() <= 0) {
		} else if (choice == 1) {
		} else if (choice == 2) {

		} else if (choice == 3) {
		}
		choice = 0;
	}

	public void playGame() {

		choice = 0;
		String menu;
		gameInitialization();
		printBackStory();
		player = new Player(playerName, 100, bandName);
		playerInitialization(player);
		printMusicNotes();

		do {
			System.out.println("\n\n\nGet ready for adventure...\n\n\n");
			story = 1;
			printStoryLine1();
			menuMethod();
			if (choice == 3) {
				System.out.println("Thank you for playing.");
				break;
			} else if (choice == 2) {
				fightMethod();
			}
			if (choice == 1) {
				runMethod();
			}
			story = 2;
			printStoryLine2();
			menuMethod();
			if (choice == 3) {
				System.out.println("Thank you for playing.");
				break;
			} else if (choice == 2) {
				fightMethod();
			}
			if (choice == 1) {
				runMethod();
			}
			story = 3;
			printStoryLine3();

		} while (choice != 3 && (player.getHealth() > 0));

		// Prompt for character name

		// present game menu
		// request options from player

	}

	public int enemyAttack() {

		return 0;
	}

}
