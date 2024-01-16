package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.Color;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.SpaceShip;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.SpecialAbility;
public class EngineerSpaceHamster extends OrdinarySpaceHamster {

    public EngineerSpaceHamster(final SpaceShip ship, final SpecialAbility ability) {
        super(ship, ability);
    }

    @Override
    public Color getUniformColor() {
        return Color.YELLOW;
    }
}
