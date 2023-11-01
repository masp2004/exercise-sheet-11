package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

import java.util.List;

/**
 * A spaceship with a crew of space hamsters.
 */
public interface SpaceShip {
	/**
	 * Gets the crew of the spaceship.
	 *
	 * @return the ships's crew
	 */
	public List<SpaceHamster> getCrew();

	/**
	 * Repairs the spaceship.
	 */
	public void repair();
}
