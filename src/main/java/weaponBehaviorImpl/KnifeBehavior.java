package weaponBehaviorImpl;

import interfaces.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Chuck..Knife");
    }
}
