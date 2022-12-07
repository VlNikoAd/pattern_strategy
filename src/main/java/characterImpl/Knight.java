package characterImpl;

import weaponBehaviorImpl.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void display() {

    }
}
