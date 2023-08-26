package characters.heroes;

import items.Item;
import items.Weapon;

import java.util.ArrayList;

public class Melee extends Hero {
    private Weapon weapon;

    public Melee(int health, int damage, int level) {
        super(health, damage, level);
        this.weapon = new Weapon("Fist", 2);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(Weapon weapon) {
        ArrayList<Item> inventory = getInventory();
        if (inventory.contains(weapon)) {
            this.weapon = weapon;
        }
    }

    public void unequipWeapon() {
        if (!weapon.getName().equals("Fist")) {
            this.weapon = new Weapon("Fist", 2);
        }
    }
}