package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.Color;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.SpaceShip;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.SpecialAbility;

/**
 * A normal space hamster that is part of a spaceship's crew.
 */
public class OrdinarySpaceHamster implements SpaceHamster {
	protected boolean isEncouraged = false;
	private final SpecialAbility ability;
	private final SpaceShip ship;

	/**
	 * Creates a new ordinary space hamster.
	 *
	 * @param ship the ship the space hamster is on
	 * @param ability the hamster's special ability
	 */
	public OrdinarySpaceHamster(final SpaceShip ship, final SpecialAbility ability) {
		super();
		this.ability = ability;
		this.ship = ship;
		this.ship.getCrew().add(this);
	}

	@Override
	public Color getUniformColor() {
		return Color.GRAY;
	}

	@Override
	public void encourage() {
		this.isEncouraged = true;
	}

	@Override
	public void useSpecialAbility() {
		ability.applySpecialAbility(ship);
		if (isEncouraged) {
			ability.applySpecialAbility(ship);
		}
	}
}
