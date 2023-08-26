package characters.heroes;

import items.DestructionSpell;
import items.Item;

import java.util.ArrayList;

public class Mage extends Hero {

    private DestructionSpell spell;

    public Mage(long health, int damage, int level) {
        super(health, damage, level);
        this.spell = null;
    }

    public DestructionSpell getSpell() {
        return spell;
    }

    public void changeSpell(DestructionSpell spell) {
        ArrayList<Item> inventory = getInventory();
        if (inventory.contains(spell)) {
            this.spell = spell;
        }
    }

    public void unequipSpell() {
        spell = null;
    }
}
