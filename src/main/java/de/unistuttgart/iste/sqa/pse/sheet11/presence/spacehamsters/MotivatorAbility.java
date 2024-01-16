package de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.spacehamsters.hamsters.SpaceHamster;
import java.util.HashSet;

/**
 * A special ability that motivates all crew members of a spaceship to enhance their performance.
 */
public class MotivatorAbility implements SpecialAbility {
    @Override
    public void applySpecialAbility(SpaceShip spaceShip) {

       HashSet<SpaceHamster> crew = new HashSet<>(spaceShip.getCrew());

         for (SpaceHamster member : crew) {
              SpaceHamster spaceHamster = (SpaceHamster) member;
              spaceHamster.encourage();
         }
    }
}

