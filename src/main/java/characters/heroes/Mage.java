package characters.heroes;

import characters.Character;
import characters.IAttackEnemies;
import characters.IAttackHeroes;
import characters.enemies.Enemy;
import items.CombatSpell;
import items.Item;

import java.util.ArrayList;

public class Mage extends Hero implements IAttackEnemies {

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

    @Override
    public void attack(Enemy enemy) {
        if (spell != null) {
            enemy.defend(spell.getDamage());

            if (enemy.getHealth() == 0) {
                addXp(enemy.getXp());
            }
        }
    }
}
