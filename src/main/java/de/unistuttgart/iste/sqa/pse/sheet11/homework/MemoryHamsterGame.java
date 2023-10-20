package de.unistuttgart.iste.sqa.pse.sheet11.homework;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * This class is used to solve some easy tasks.
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
		this.inOrder();
		this.reverseOrder();
		this.sort();
	}
	
	/**
	 * TODO
	 */
	private void reverseOrder() {
		// TODO implement
	}
	
	/**
	 * TODO
	 */
	private void inOrder() {
		// TODO implement
	}
	
	/**
	 * TODO
	 */
	private void sort() {
		// TODO implement
	}
}
