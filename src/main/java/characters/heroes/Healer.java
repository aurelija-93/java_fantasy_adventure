package characters.heroes;

import items.HealingSpell;
import items.Item;

import java.util.ArrayList;

public class Healer extends Hero {

    private HealingSpell spell;

    public Healer(int health, int damage, int level) {
        super(health, damage, level);
        this.spell = null;
    }

    public HealingSpell getSpell() {
        return spell;
    }

    public void changeSpell(HealingSpell spell) {
        ArrayList<Item> inventory = getInventory();
        if (inventory.contains(spell)) {
            this.spell = spell;
        }
    }

    public void unequipSpell() {
        spell = null;
    }
}
