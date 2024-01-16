package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.Color;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.SpaceShip;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.SpecialAbility;
public class ScienceSpaceHamster extends OrdinarySpaceHamster {

    public ScienceSpaceHamster(final SpaceShip ship, final SpecialAbility ability) {
        super(ship, ability);
    }

    @Override
    public Color getUniformColor() {
        return Color.BLUE;
    }
}
