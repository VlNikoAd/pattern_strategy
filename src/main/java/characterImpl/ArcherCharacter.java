package characterImpl;

import weaponBehaviorImpl.BowAndArrowBehavior;

public class ArcherCharacter extends Character {

    public ArcherCharacter() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void display() {

    }
}
