package us2;

import game.Game;
import game.Player;

public class UAT1 {

	public static void main(String[] args) {

		Player player = new Player("Voxel");
		Game game = new Game();

		game.addPlayer(player);
		game.start();
		game.movePlayer(player, 96);
		System.out.println("US2.UAT1: The token is on square: " + game.playerPosition(player));

		game.movePlayer(player, 3);
		System.out.println("Token moved 3 spaces");
		System.out.println("The token is now on square: " + game.playerPosition(player));

		if (game.playerHasWon(player)) {
			System.out.println("Player has won");
		} else {
			System.out.println("Player has not won");
		}

	}
	
}
