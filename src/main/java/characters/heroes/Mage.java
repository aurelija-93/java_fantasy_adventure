package characters.heroes;

import items.CombatSpell;
import items.Item;

import java.util.ArrayList;

public class Mage extends Hero {

    private CombatSpell spell;

    public Mage(int health, int damage, int level) {
        super(health, damage, level);
        this.spell = null;
    }

    public CombatSpell getSpell() {
        return spell;
    }

    public void changeSpell(CombatSpell spell) {
        ArrayList<Item> inventory = getInventory();
        if (inventory.contains(spell)) {
            this.spell = spell;
        }
    }

    public void unequipSpell() {
        spell = null;
    }
}
