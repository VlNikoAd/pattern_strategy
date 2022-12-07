package weaponBehaviorImpl;

import interfaces.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Dzin..Sword");
    }
}
