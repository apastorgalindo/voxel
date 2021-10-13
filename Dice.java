package game;

import java.util.Random;

/*
 * Dice game. Will use to roll a random number between 1-6
 * @author: Alvaro Pastor
 */


public class Dice {

	private int number;
	
	/*
	 * Constructor. The dice's start at a value of 0
	 */
	
	public Dice() {
		number=0;
	}
	
	/*
	 * Function that changes the value of the dice between 1-6
	 */
	
	public void rollDice () {
		number = new Random().nextInt(6)+1;
	}
	
	/*
	 * Function that returns the value of the dice
	 * @return number: dice's value
	 */
	
	public int getDiceNumber() {
		return number;
	}
	
}
