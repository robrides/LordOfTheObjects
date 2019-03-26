package LordOfTheObjects;

public class GameApp {

	public static void main(String[] args) {
		GameApp gApp = new GameApp();

		gApp.start();

	}

	private void start() {

		// Instantiate GameDriver
		GameDriver game = new GameDriver();

		// call GameDriver main logic
		game.playGame();

	}
}
