package characters.heroes;

import characters.IDefend;
import items.Armour;
import items.Item;
import items.Weapon;

import java.util.ArrayList;

public class Melee extends Hero implements IDefend {
    private Weapon weapon;
    private Armour armour;

    public Melee(int health, int damage, int level) {
        super(health, damage, level);
        this.weapon = new Weapon("Fist", 2);
        this.armour = null;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armour getArmour() {
        return armour;
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

    public void changeArmour(Armour armour) {
        ArrayList<Item> inventory = getInventory();
        if (inventory.contains(armour)) {
            this.armour = armour;
        }
    }

    public void unequipArmour() {
        armour = null;
    }

    @Override
    public void defend(int damage) {
        if (armour == null) {
            reduceHealth(damage);
        } else {
            if (damage < armour.getArmourStrength()) {
                armour.setArmourStrength(armour.getArmourStrength() - damage);
            } else if (damage == armour.getArmourStrength()) {
                unequipArmour();
                removeFromInventory(armour);
            } else {
                int remainingDamage = damage - armour.getArmourStrength();
                unequipArmour();
                removeFromInventory(armour);
                reduceHealth(remainingDamage);
            }
        }
    }
}