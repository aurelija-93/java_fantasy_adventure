package characterTests;

import characters.enemies.Monster;
import characters.heroes.Mage;
import items.CombatSpell;
import items.Item;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MageTest {
    private Mage mage;
    private Item item1;
    private CombatSpell spell;

    @Before
    public void before() {
        mage = new Mage(100, 20, 1);
        spell = new CombatSpell("Fireball", 20);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, mage.getHealth());
    }

    @Test
    public void hasDamage() {
        assertEquals(20, mage.getDamage());
    }

    @Test
    public void startsWithNoXp() {
        assertEquals(0, mage.getXp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, mage.getLevel());
    }

    @Test
    public void startsWith100Gold() {
        assertEquals(100, mage.getGold());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, mage.getInventory().size());
    }

    @Test
    public void startsWithNullSpell() {
        assertNull(mage.getSpell());
    }

    @Test
    public void canAddGold() {
        mage.addGold(50);
        assertEquals(150, mage.getGold());
    }

    @Test
    public void canAddXp() {
        mage.addXp(10);
        assertEquals(10, mage.getXp());
    }

    @Test
    public void canAddToInventory() {
        item1 = new Item("Healing potion");
        mage.addToInventory(item1);
        assertEquals(1, mage.getInventory().size());
    }

    @Test
    public void canRemoveFromInventory() {
        item1 = new Item("Healing potion");
        Item item2 = new Item("Sword");
        Item item3 = new Item("Diamond");
        mage.addToInventory(item1);
        mage.addToInventory(item2);
        mage.addToInventory(item3);
        mage.removeFromInventory(item2);
        assertEquals(2, mage.getInventory().size());
    }

    @Test
    public void canLevelUp() {
        mage.levelUp();
        assertEquals(120, mage.getHealth());
        assertEquals(24, mage.getDamage());
        assertEquals(0, mage.getXp());
        assertEquals(2, mage.getLevel());
    }

    @Test
    public void canDefend() {
        mage.defend(20);
        assertEquals(80, mage.getHealth());
    }

    @Test
    public void cannotReduceHealthBelowZero() {
        mage.defend(200);
        assertEquals(0, mage.getHealth());
    }

    @Test
    public void canChangeSpell() {
        mage.addToInventory(spell);
        mage.changeSpell(spell);
        assertEquals("Fireball", mage.getSpell().getName());
        assertEquals(20, mage.getSpell().getDamage());
    }

    @Test
    public void cannotEquipSpellNotInInventory() {
        mage.changeSpell(spell);
        assertNull(mage.getSpell());
    }

    @Test
    public void canUnequipSpell() {
        mage.addToInventory(spell);
        mage.changeSpell(spell);
        mage.unequipSpell();
        assertNull(mage.getSpell());
    }

    @Test
    public void canGetHealed() {
        mage.defend(50);
        mage.getHealed(30);
        assertEquals(80, mage.getHealth());
    }

    @Test
    public void cannotHealBeyondMaxHealth() {
        mage.defend(50);
        mage.getHealed(200);
        assertEquals(100, mage.getHealth());
    }

    @Test
    public void canAttack() {
        Monster enemy = new Monster(100, 10, 10, 1);
        mage.addToInventory(spell);
        mage.changeSpell(spell);
        mage.attack(enemy);
        assertEquals(80, enemy.getHealth());
    }

    @Test
    public void canGetXpOnKill() {
        Monster enemy = new Monster(100, 10, 10, 1);
        CombatSpell spell = new CombatSpell("Earthquake", 100);
        mage.addToInventory(spell);
        mage.changeSpell(spell);
        mage.attack(enemy);
        assertEquals(0, enemy.getHealth());
        assertEquals(10, mage.getXp());
    }
}
