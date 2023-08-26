package characters.heroes;

import items.Weapon;

public class Melee extends Hero {
    private Weapon weapon;
    public Melee(long health, int damage, int level) {
        super(health, damage, level);
        this.weapon = new Weapon("Fist", 2);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
