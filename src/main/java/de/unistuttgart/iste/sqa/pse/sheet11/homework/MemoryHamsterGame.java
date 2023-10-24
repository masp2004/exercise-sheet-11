package de.unistuttgart.iste.sqa.pse.sheet11.homework;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Class to implement exercises sheet 1, exercises 1, 2 and 3.
 */
public class MemoryHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new ArtemisPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public MemoryHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/order.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	@Override
	protected void run() {
		// Comment any operation call out, to run the others on their own.  
		this.inOrder();
		this.reverseOrder();
		this.sort();
		
		// TODO Add code for exercise 3 (d) here
	}
	
	/**
	 * TODO 
	 */
	private void reverseOrder() {
		// TODO implement exercise 1 (b)
	}
	
	/**
	 * TODO
	 */
	private void inOrder() {
		// TODO implement exercise 2 (b)
	}
	
	/**
	 * TODO
	 */
	private void sort() {
		// TODO implement exercise 3 (b)
	}
	
	// TODO Add Operation for exercise 3 (c) here
	
	// TODO Add required helper operations here
}
