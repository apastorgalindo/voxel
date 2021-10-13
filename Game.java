package game;

import java.util.HashMap;

/*
 * Class game. Will develop everything about snake and ladders game
 * @author: Alvaro Pastor
 */


public class Game {

	private static final int MAX = 100;
	private int [] board;
	private boolean gameStarted=false;
	private HashMap<Player,Integer> players;
	private Dice dice;
	
	/*
	 * Constructor of game. 
	 * Initialize a board of 100 square, each of them containing the position where the player with go if they land on it
	 * Intialize the object dice and a map containing the position of each player that it's add in the game
	 */
	
	public Game() {
		
		board = new int[MAX];
		for (int i=0;i<MAX;i++) board[i]=i+1;
		
		dice = new Dice();
		players = new HashMap<Player,Integer>();
		
	}
	
	/*
	 * Function that adds a player to the game. Each one starts on the first square
	 * @param Player: player to be added to the game 
	 */
	
	public void addPlayer (Player player) {
	
		players.put(player,1);
	}
	
	/*
	 * Function that moves a player throughout the board. It will me moved the number of squares indicated in the second param, unless it reaches above the maximum permitted
	 * @param Player: player to be moved in the board
	 * @param numSquares: number of squares that it will be moves.
	 */
	
	public void movePlayer (Player player, int numSquares) {
		
		if (players.containsKey(player) && gameStarted) {
			int newPosition = board[players.get(player)-1] + numSquares;
			if (newPosition <= MAX) players.put(player, newPosition);
		}
		
	}
	
	/*
	 * Function that returns the square where a player is placed at
	 * @param player: player to find out where is at
	 */
	
	public int playerPosition (Player player) {
		return (players.get(player));
	}
	
		
	/*
	 * Function that returns if the player has reached the last square of the board
	 * @param player: player to find out if it has won
	 * @return boolean: true if the player has reached the last square
	 */
	
	
	public boolean playerHasWon (Player player) {
		return (players.get(player) == MAX);
	}
	
	/*
	 * Function that return the dice
	 * @return dice: the dice of the game
	 */
	
	public Dice getDice() {
		return dice;
	}
	
	/*
	 * Function that starts the game. 
	 */
	
	public void start() {
		gameStarted=true;
	}
	
}
