package us1;

import game.Game;
import game.Player;

public class UAT1 {

	public static void main(String[] args) {
		
		Player player = new Player ("Voxel");
		Game game = new Game();
		
		game.addPlayer(player);
		game.start();
		System.out.println("US1.UAT1: The token is on square :"+ game.playerPosition(player));
		
	}
}
