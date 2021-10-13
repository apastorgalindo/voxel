package game;

/*
 * Class game. Will develop everything about snake and ladders game
 * @author: Alvaro Pastor
 */

public class Player {

	private String name;
	
	/*
	 * Constructor. The player has a name
	 */
	
	public Player(String name) {
		this.name=name;
	}
	
	/*
	 * Function that returns the name of the player
	 */

	public String getName() {
		return name;
	}
	
}
