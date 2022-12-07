package characterImpl;

import interfaces.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public Character() {
    }

    public abstract void display();

    public void useWeapon() {
        weapon.useWeapon();
    }
}