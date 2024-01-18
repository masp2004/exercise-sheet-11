package de.unistuttgart.iste.sqa.pse.sheet11.homework;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;
import java.util.*;

/**
 * Class to implement homework exercises 1, 2 and 3 of sheet 11.
 */
public class MemoryHamsterGame extends SimpleHamsterGame {

	private Queue<Integer> grainQueue;

	/**
	 * Creates a new MemoryHamsterGame.<br>
	 * Do not modify!
	 */
	public MemoryHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/order.ter");
		this.displayInNewGameWindow();
		game.startGame();
		grainQueue = new LinkedList<>();
	}

	@Override
	protected void run() {
		// Comment any operation call out, to run the others on their own.
		this.inOrder();
		this.reverseOrder();
		this.sort();

		Comparator<Integer> descendingComparator = (a, b) -> Integer.compare(b, a);
		this.sort(descendingComparator);
	}


	/**
	 * This method reverses the order of the grains in the territory using a Queue.
	 */
	private void reverseOrder() {
		Queue<Integer> grainCounts = new LinkedList<>();

		/*@ loop_invariant paule.frontIsClear();
		  @ decreasing number of grains available on current field
		  @*/
		while (paule.frontIsClear()) {
			paule.move();
			int currentGrainCount = 0;

			/*@ loop_invariant paule.grainAvailable();
			  @ decreasing number of grains available on current field
			  @*/
			while (paule.grainAvailable()) {
				paule.pickGrain();
				currentGrainCount++;
			}

			grainCounts.add(currentGrainCount);
		}

		paule.turnLeft();
		paule.turnLeft();

		/*@ loop_invariant paule.frontIsClear();
		  @ decreasing number of grains available on current field
		  @*/
		while (!grainCounts.isEmpty()) {
			int currentGrainCount = grainCounts.poll();

			if (paule.frontIsClear()) {
				paule.move();
			}

			/*@ loop_invariant paule.grainAvailable();
			  @ decreasing number of grains available on current field
			  @*/
			for (int i = 0; i < currentGrainCount; i++) {
				paule.putGrain();
			}

		}

		paule.turnLeft();
		paule.turnLeft();
	}

	/**
	 * This method places the grains in the original order on the way back to the initial position.
	 */
	private void inOrder() {
		Stack<Integer> grainCounts = new Stack<>();

		/*@ loop_invariant paule.frontIsClear();
		  @ decreasing number of grains available on current field
		  @*/
		while (paule.frontIsClear()) {
			paule.move();
			int currentGrainCount = 0;

			/*@ loop_invariant paule.grainAvailable();
			  @ decreasing number of grains available on current field
			  @*/
			while (paule.grainAvailable()) {
				paule.pickGrain();
				currentGrainCount++;
			}

			grainCounts.push(currentGrainCount);
		}

		paule.turnLeft();
		paule.turnLeft();

		/*@ loop_invariant grainCounts.size() > 0;
		  @ decreasing number of grains available on current field
		  @*/
		while (!grainCounts.isEmpty()) {
			int currentGrainCount = grainCounts.pop();

			/*@ loop_invariant paule.grainAvailable();
			  @ decreasing number of grains available on current field
			  @*/
			for (int i = 0; i < currentGrainCount; i++) {
				paule.putGrain();
			}

			if (paule.frontIsClear()) {
				paule.move();
			}
		}

		paule.turnLeft();
		paule.turnLeft();
	}

	/**
	 * Makes paule sort the Grains in descending order from right to left perspective.
	 */
	private void sort() {
		List<Integer> pickedGrainsList = new ArrayList<>();

		while(paule.frontIsClear()){
			int pickedGrains = 0;

			/*@ loop_invariant paule.grainAvailable();
			  @ decreasing number of grains available on current field
			  @*/
			while(paule.grainAvailable()){
				paule.pickGrain();
				pickedGrains++;
			}

			pickedGrainsList.add(pickedGrains);
			paule.move();
		}

		int pickedGrains = 0;

		/*@ loop_invariant paule.grainAvailable();
		  @ decreasing number of grains available on current field
		  @*/
		while(paule.grainAvailable()){
			paule.pickGrain();
			pickedGrains++;
		}

		pickedGrainsList.add(pickedGrains);
		Collections.sort(pickedGrainsList);

		paule.turnLeft();
		paule.turnLeft();

		/*@ loop_invariant pickedGrainsList.size() > 0;
		  @ decreasing number of grains available on current field
		  @*/
		for(int i = 0; i < pickedGrainsList.size(); i++){

			/*@ loop_invariant paule.grainAvailable();
			  @ decreasing number of grains available on current field
			  @*/
			for (int j = pickedGrainsList.get(i); j > 0; j--){
				paule.putGrain();
			}
			if (!(i == (pickedGrainsList.size()) + - 1 )) {
				paule.move();
			}
		}
		paule.turnLeft();
		paule.turnLeft();
	}

	/**
	 * This method sorts the grains on the way back to the initial position using the provided Comparator.
	 * @param comparator The comparator to use for sorting.
	 */
	private void sort(Comparator<Integer> comparator) {
		List<Integer> pickedGrainsList = new ArrayList<>();

		/*@ loop_invariant paule.frontIsClear();
	  	  @ decreasing number of grains available on the current field
	 	@*/
		while(paule.frontIsClear()){
			int pickedGrains = 0;

        /*@ loop_invariant paule.grainAvailable();
          @ decreasing number of grains available on the current field
          @*/
			while(paule.grainAvailable()){
				paule.pickGrain();
				pickedGrains++;
			}

			pickedGrainsList.add(pickedGrains);
			paule.move();
		}

		int pickedGrains = 0;

    /*@ loop_invariant paule.grainAvailable();
      @ decreasing number of grains available on the current field
      @*/
		while(paule.grainAvailable()){
			paule.pickGrain();
			pickedGrains++;
		}

		pickedGrainsList.add(pickedGrains);

		pickedGrainsList.sort(comparator);

		paule.turnLeft();
		paule.turnLeft();

    /*@ loop_invariant pickedGrainsList.size() > 0;
      @ decreasing number of grains available on the current field
      @*/
		for(int i = 0; i < pickedGrainsList.size(); i++){

        /*@ loop_invariant paule.grainAvailable();
          @ decreasing number of grains available on the current field
          @*/
			for (int j = pickedGrainsList.get(i); j > 0; j--){
				paule.putGrain();
			}
			if (!(i == (pickedGrainsList.size()) + - 1 )) {
				paule.move();
			}
		}

		paule.turnLeft();
		paule.turnLeft();
	}

}
