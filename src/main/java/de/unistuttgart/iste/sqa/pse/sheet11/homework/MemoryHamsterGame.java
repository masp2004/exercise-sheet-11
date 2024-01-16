package de.unistuttgart.iste.sqa.pse.sheet11.homework;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Comparator;

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

		Comparator<Integer> descendingComparator = (Integer a, Integer b) -> Integer.compare(b, a);
		this.sort(descendingComparator);
	}

	/**
	 * This method reverses the order of the grains in the territory.
	 */
	private void reverseOrder() {
		Queue<Integer> reversedQueue = new LinkedList<>();

		while (!grainQueue.isEmpty()) {
			reversedQueue.add(reversedQueue.poll());
		}
		while (!reversedQueue.isEmpty()) {
			reversedQueue.add(reversedQueue.poll());
		}
	}

	/**
	 * This method sorts the grains in the territory in ascending order.
	 */
	private void inOrder() {
		Stack<Integer> stack = new Stack<>();

		while (!grainQueue.isEmpty()) {
			stack.push(grainQueue.poll());
		}
		while (!stack.isEmpty()) {
			grainQueue.add(stack.pop());
		}
	}

	/**
	 * This method sorts the grains in the territory in ascending order.
	 */
	private void sort() {
		PriorityQueue<Integer> sortedQueue = new PriorityQueue<>(grainQueue);

		while (!sortedQueue.isEmpty()) {
			grainQueue.add(sortedQueue.poll());
		}
	}

	/**
	 * This method sorts the grains in the territory in ascending order.
	 * @param comparator The comparator to use for sorting.
	 */
	private void sort(Comparator<Integer> comparator) {
		PriorityQueue<Integer> sortedQueue = new PriorityQueue<>(comparator);
		sortedQueue.addAll(grainQueue);

		while (!sortedQueue.isEmpty()) {
			grainQueue.add(sortedQueue.poll());
		}
	}
}
