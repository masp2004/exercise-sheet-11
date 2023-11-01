package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

/**
 * A space hamster in a commanding position.
 * Commanding space hamsters wear red uniforms.
 */
public class CommandSpaceHamster extends OrdinarySpaceHamster {
	/**
	 * Creates a new {@link CommandSpaceHamster}.
	 *
	 * @param ship the ship the space hamster is on
	 * @param ability the hamster's special ability
	 */
	public CommandSpaceHamster(final SpaceShip ship, final SpecialAbility ability) {
		super(ship, ability);
	}

	@Override
	public Color getUniformColor() {
		return Color.RED;
	}
}