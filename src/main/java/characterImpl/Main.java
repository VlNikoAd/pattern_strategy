package characterImpl;

public class Main {

    public static void main(String[] args) {

        Character archer = new ArcherCharacter();
        Character knight = new Knight();
        Character roga = new Roga();

        archer.useWeapon();
        knight.useWeapon();
        roga.useWeapon();
    }
}
