package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

public class OrdinarySpaceHamster implements SpaceHamster {
	protected boolean isEncouraged = false;
	private final SpecialAbility ability;
	private SpaceShip ship;

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
