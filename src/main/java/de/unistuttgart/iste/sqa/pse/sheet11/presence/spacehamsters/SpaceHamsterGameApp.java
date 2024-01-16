package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters.EngineerSpaceHamster;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters.ScienceSpaceHamster;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.SpaceShip;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.SpecialAbility;
import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.MotivatorAbility;

public class SpaceHamsterGameApp {
    public static void main(String[] args) {
        SpaceHamsterGameApp app = new SpaceHamsterGameApp();
        EngineerSpaceHamster engineer = new EngineerSpaceHamster(new SpaceShip(), SpaceShip::repair);
        ScienceSpaceHamster scientist = new ScienceSpaceHamster(new SpaceShip(), new MotivatorAbility());
    }
}
