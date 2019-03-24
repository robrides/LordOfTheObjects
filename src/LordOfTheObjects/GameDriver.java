package LordOfTheObjects;

import java.util.Scanner;

public class GameDriver {

	// Setup game objects and variables
	private GatherEnemies enemies;
	private Player player;
	private Enemy enemy1;
	private Enemy enemy2;
	private Enemy enemy3;
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

	public void gameInitialization() {

		// Instantiate and setup enemies
		enemies = new GatherEnemies();
		enemy1 = new Enemy("Joe the junkie", 90,
				"You pick up a slim jim and hit the junkie over the head\nThe junkie lunges at you and cuts your arm\n",
				"You throw a box of tampons and hit the junkie in the eye.\n"
						+ "The junkie throws the broken bottle at you and hits you in the head \n",
				"You find a fire extinguisher and knock the junkie out. \nThe junkie dies.",
				"The junkie chased after you and stabbed you with the broken bottle, you \nimmediately contract AIDS and die. \nGame Over.");
		enemy2 = new Enemy("CRAZED Fan!!!", 90,
				"You give the fan an autograph\n"
						+ "The fan tells you they will scream louder if you don’t let them back-stage",
				"You give them back-stage passes and beg them not to cause a scene.\n"
						+ "The fan is still not satisfied and insists on meeting the rest of the band.",
				"You agree to let the fan come with you to meet the band.\nThey immediately have a heart attack from pure excitement and die.",
				"The crazed fan’s outburst drew everyone's attention towards you and a mob is formed. \nYou try to outrun them, but are no match for the hundreds of people barreling towards \nyou and you are trampled to death by your own fans. \nGame Over.");
		enemy3 = new Enemy("Bo the Bouncer", 90,
				"You kick him square in the nuts\n" + "He drops you and you land on your ankle funny.",
				"You dig a big piece of glass out of your arm from when the junkie attacked \nyou and use it to slice open a large gash on the bouncers face.\n"
						+ "The bouncer back hands you right in the jaw.",
				"One of your bandmates spots you and throws you a guitar, you beat the bouncer with it.\nThe bouncer dies from his wounds",
				"The bouncer throws you out onto the sidewalk. Some millennials on motorized scooters \nare too busy hitting their Juuls to realise you are laying in their path. They run \nover your neck which snaps you die instantly. \nGame Over.");

		enemies.addEnemy(enemy1);
		enemies.addEnemy(enemy2);
		enemies.addEnemy(enemy3);
	}

	public void playerInitialization() {

		System.out.println("Please enter your musician name >>");
		playerName = kb.nextLine();

		System.out.println("Please enter your band name >>");
		bandName = kb.nextLine();
		player = new Player(playerName, 100, bandName);
		player.setHealth(100);

	}

	public void printIntro() {

		System.out.println("Welcome to Venture to the Venue.\n");

	}

	public void printMusicNotes() {
		System.out.println(
				"\n\u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B\n\u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A\n\u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266A \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B \u266B");
	}

	public void printStoryLine1() {
		System.out.println("\nYou have just woken up in an alley. Your head is pounding, your clothes are \nwet,"
				+ "and you’ve just realized you are " + player.getName() + " and your band " + player.getBandName()
				+ " has a concert across \ntown in 45 minutes. You pick yourself up and start walking toward the street \nwhere you see a corner store. You go in to ask for directions when Joe the junkie \njumps out of nowhere with a broken bottle and tries to attack you! \n\n");

	}

	public void printStoryLine2() {

		System.out.println(
				"You sprint out of the corner store and down Main Street for a few blocks. \nBloody, bruised, and wet, you make your way towards the venue when you \nrealize it’s 2019 and you can totally just call an Uber. The uber arrives \nand takes you close to the venue, but the road is blocked off so you have \nto walk the rest of the way. All of the sudden a CRAZED fan yells “Is that \n"
						+ player.getName() + " from " + player.getBandName() + " and starts booking it towards you.\n");
	}

	public void printStoryLine3() {

		System.out.println(
				"You run away before anyone notices and you go towards the back entrance of the venue. \nYou realized that somewhere along the way you lost your band member backstage pass \nand now you have no way of getting in. You walk up to the bouncer and tell him you are \nwith the band and he laughs in your face. He asks for your pass and when you tell him \nyou lost it, he picks you up and tries to throw you.\n");
	}

	public void printWinStory() {

		System.out.println(
				"You finally make it into the venue and your venture is over. You go on to have the \nperformance of a lifetime and get signed by “The Big Record Label.” You join the \nilluminati who hides the 3 deaths you were responsible for and you become supreme \noverload of the music industry. You live happily ever after and never die because \nyou sold your soul to the devil. \n\nThe End.");

	}

	public void getMenuChoice() {

		do {

			System.out.println("Do you : (1. Run) (2. Fight) (3. Quit Game)\n");
			choice = kb.nextInt();
			System.out.println();

		} while (choice != 1 && choice != 2 && choice != 3);

	}

	public void fightMethod() {
		int healthReduction = 0;

		if (story == 1) {
			for (int i = 0; i < 3; i++) {
				System.out.println(enemies.getEnemies()[0].getAttackScenarios(i));
				System.out.println("\nYour attack caused 30 points in damage!!!");
				enemy1.takeDamage(30);
				System.out.println(enemy1.getName() + "'s health is: " + enemy1.getHealth() + "\n");
				healthReduction = (int) (Math.random() * 20);
				System.out.println(healthReduction + " points in health reducation to " + player.getName());
				player.takeDamage(healthReduction);
				if (player.getHealth() <= 0) {
					break;
				}
				System.out.println(player.getName() + "'s current health: " + player.getHealth() + "\n");
				if (i == 2) {
					break;
				} else {
					getMenuChoice();
					if (choice == 3) {
						System.out.println("Thank you for playing.");
						break;
					} else if (choice == 2) {
						continue;
					}
					if (choice == 1) {
						runMethod();
						break;
					}
				}
			}
		} else if (story == 2) {
			for (int i = 0; i < 3; i++) {
				System.out.println(enemies.getEnemies()[1].getAttackScenarios(i));
				System.out.println("\nYour attack caused 30 points in damage!!!");
				enemy2.takeDamage(30);
				System.out.println(enemy2.getName() + "'s health is: " + enemy2.getHealth() + "\n");
				healthReduction = (int) (Math.random() * 20);
				System.out.println(healthReduction + " points in health reducation to " + player.getName());
				player.takeDamage(healthReduction);
				if (player.getHealth() <= 0) {
					break;
				}
				System.out.println(player.getName() + "'s current health: " + player.getHealth() + "\n");
				if (i == 2) {
					break;
				} else {
					getMenuChoice();
					if (choice == 3) {
						System.out.println("Thank you for playing.");
						break;
					} else if (choice == 2) {
						continue;
					}
					if (choice == 1) {
						runMethod();
						break;
					}
				}
			}
		} else if (story == 3) {
			for (int i = 0; i < 3; i++) {
				System.out.println(enemies.getEnemies()[2].getAttackScenarios(i));
				System.out.println("\nYour attack caused 30 points in damage!!!");
				enemy3.takeDamage(30);
				System.out.println(enemy3.getName() + "'s health is: " + enemy3.getHealth() + "\n");
				healthReduction = (int) (Math.random() * 20);
				System.out.println(healthReduction + " points in health reducation to " + player.getName());
				player.takeDamage(healthReduction);
				if (player.getHealth() <= 0) {
					break;
				}
				System.out.println(player.getName() + "'s current health: " + player.getHealth() + "\n");
				if (i == 2) {
					break;
				} else {
					getMenuChoice();
					if (choice == 3) {
						System.out.println("Thank you for playing.");
						break;
					} else if (choice == 2) {
						continue;
					}
					if (choice == 1) {
						runMethod();
						break;
					}
				}
			}
		}
	}

	public void runMethod() {

		System.out.println(enemies.getEnemies()[story - 1].getAttackScenarios(3));
		choice = 0;
		player.takeDamage(player.getHealth());
		System.out.println(player.getName() + "'s current health: " + player.getHealth() + "\n");

	}

	public void playGame() {
		int endChoice = 0;
		gameInitialization();
		printIntro();
		playerInitialization();
		printMusicNotes();
		System.out.println();
		System.out.println(player.toString() + "\n\n");
		System.out.println(enemies.toString() + "\n\n");

		do {
			System.out.println("\nGet ready for adventure...\n\n\n");
			player.setHealth(100);
			enemy1.setHealth(90);
			enemy2.setHealth(90);
			enemy3.setHealth(90);
			choice = 0;
			endChoice = 0;
			story = 1;
			printStoryLine1();
			getMenuChoice();
			if (choice == 3) {
				break;
			} else if (choice == 2) {
				fightMethod();
				if (player.getHealth() <= 0) {
					System.out.println("\n\nWould you like to play again?\n (1. Yes) (2. No) >> ");
					endChoice = kb.nextInt();
					if (endChoice == 2) {
						break;
					}
				}
			}
			if (choice == 1) {
				runMethod();
				System.out.println("\n\nWould you like to play again?\n (1. Yes) (2. No) >> ");
				endChoice = kb.nextInt();
				if (endChoice == 2) {
					break;
				}
			}
			if (choice != 3 && player.getHealth() > 0) {
				story = 2;
				printStoryLine2();
				getMenuChoice();
				if (choice == 3) {
					break;
				} else if (choice == 2) {
					fightMethod();
					if (player.getHealth() <= 0) {
						System.out.println("\n\nWould you like to play again?\n (1. Yes) (2. No) >> ");
						endChoice = kb.nextInt();
						if (endChoice == 2) {
							break;
						}
					}
				}
				if (choice == 1) {
					runMethod();
					System.out.println("\n\nWould you like to play again?\n (1. Yes) (2. No) >> ");
					endChoice = kb.nextInt();
					if (endChoice == 2) {
						break;
					}
				}
			}
			if (choice != 3 && player.getHealth() > 0) {
				story = 3;
				printStoryLine3();
				getMenuChoice();
				if (choice == 3) {
					break;
				} else if (choice == 2) {
					fightMethod();
					if (player.getHealth() <= 0) {
						System.out.println("\n\nWould you like to play again?\n (1. Yes) (2. No) >> ");
						endChoice = kb.nextInt();
						if (endChoice == 2) {
							break;
						}
					}
				}
				if (choice == 1) {
					runMethod();
					System.out.println("\n\nWould you like to play again?\n (1. Yes) (2. No) >> ");
					endChoice = kb.nextInt();
					if (endChoice == 2) {
						break;
					}
				}
			}
			if (choice != 3 && player.getHealth() > 0) {
				printWinStory();
				System.out.println("\n\nWould you like to play again?\n (1. Yes) (2. No) >> ");
				endChoice = kb.nextInt();
				if (endChoice == 2) {
					break;
				}
			}

		} while (choice != 3 && endChoice < 2);

		System.out.println("\n\n\nThank you for playing Venture to the Venue!\n");
		printMusicNotes();

	}


}
