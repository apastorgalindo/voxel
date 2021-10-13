package us1;

import game.Game;
import game.Player;

public class UAT3 {

	public static void main(String[] args) {

		Player player = new Player("Voxel");
		Game game = new Game();

		game.addPlayer(player);
		game.start();
		System.out.println("US1.UAT3: The token is on square: " + game.playerPosition(player));
		game.movePlayer(player, 3);
		System.out.println("Token moved 3 spaces");
		game.movePlayer(player, 4);
		System.out.println("Token moved 4 spaces");
		System.out.println("The token is now on square: " + game.playerPosition(player));

	}

}
