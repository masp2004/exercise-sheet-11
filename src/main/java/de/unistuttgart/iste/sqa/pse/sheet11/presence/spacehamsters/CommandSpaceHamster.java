package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

public class CommandSpaceHamster extends OrdinarySpaceHamster {
	public CommandSpaceHamster(final SpaceShip ship, final SpecialAbility ability) {
		super(ship, ability);
	}

	@Override
	public Color getUniformColor() {
		return Color.RED;
	}
}