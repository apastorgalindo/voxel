package us3;

import game.Game;
import game.Player;

public class UAT2 {

	public static void main(String[] args) {

		Player player = new Player("Voxel");
		Game game = new Game();

		game.addPlayer(player);
		game.start();
		
		System.out.println("US3.UAT2: The token is on square: " + game.playerPosition(player));
		
		game.getDice().rollDice();

		System.out.println("Dice result: " + game.getDice().getDiceNumber());
		
		game.movePlayer(player, game.getDice().getDiceNumber());
		
		System.out.println("The token is now on square: " + game.playerPosition(player));
		

	}

}
