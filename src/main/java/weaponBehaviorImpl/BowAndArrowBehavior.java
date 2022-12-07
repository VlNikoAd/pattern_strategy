package weaponBehaviorImpl;

import interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Tss..Bow and Arrow");
    }
}
