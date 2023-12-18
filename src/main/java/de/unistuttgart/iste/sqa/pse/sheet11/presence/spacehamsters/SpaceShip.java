package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

import java.util.HashSet;
import java.util.Set;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters.SpaceHamster;

/**
 * A spaceship with a crew of space hamsters.
 * 
 * The crew must never be null.
 */
public class SpaceShip {

	private final Set<SpaceHamster> crew;

	/**
	 * Create a new space ship with an empty crew.
	 * 
	 * Ensures that {@code this.crew != null} and {@code this.crew.isEmpty() == true}.
	 */
	public SpaceShip() {
		this.crew = new HashSet<SpaceHamster>();
	}
	
	
	/**
	 * 
	 * @param hamster
	 */
	public void addCrewMember(final SpaceHamster hamster) {
		if (hamster == null) {
			throw new IllegalArgumentException("New crew member must not be null!");
		}
		crew.add(hamster);
	}

	/**
	 * Gets the crew of the spaceship.
	 *
	 * @return the ships's crew
	 */
	public Set<SpaceHamster> getCrew() {
		return this.crew;
	}

	/**
	 * Repairs the spaceship.
	 */
	public void repair() {
		System.out.println("This ship is being repaired.");

	}
}
