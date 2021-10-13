package us3;

import game.Game;
import game.Player;

public class UAT1 {

	public static void main(String[] args) {

		Player player = new Player("Voxel");
		Game game = new Game();

		game.addPlayer(player);
		game.start();
		game.getDice().rollDice();
		System.out.println("US3.UAT1: Dice result: " + game.getDice().getDiceNumber());

	}

}
