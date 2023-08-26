package characterTests;

import characters.heroes.Healer;
import characters.heroes.Melee;
import items.HealingSpell;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class HealerTest {
    private Healer healer;
    private Item item1;

    private HealingSpell spell;

    @Before
    public void before() {
        healer = new Healer(100, 20, 1);
        spell = new HealingSpell("Basic Heal", 25);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, healer.getHealth());
    }

    @Test
    public void hasDamage() {
        assertEquals(20, healer.getDamage());
    }

    @Test
    public void startsWithNoXp() {
        assertEquals(0, healer.getXp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, healer.getLevel());
    }

    @Test
    public void startsWith100Gold() {
        assertEquals(100, healer.getGold());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, healer.getInventory().size());
    }

    @Test
    public void startsWithNullSpell() {
        assertNull(healer.getSpell());
    }

    @Test
    public void canAddGold() {
        healer.addGold(50);
        assertEquals(150, healer.getGold());
    }

    @Test
    public void canAddXp() {
        healer.addXp(10);
        assertEquals(10, healer.getXp());
    }

    @Test
    public void canAddToInventory() {
        item1 = new Item("Healing potion");
        healer.addToInventory(item1);
        assertEquals(1, healer.getInventory().size());
    }

    @Test
    public void canRemoveFromInventory() {
        item1 = new Item("Healing potion");
        Item item2 = new Item("Sword");
        Item item3 = new Item("Diamond");
        healer.addToInventory(item1);
        healer.addToInventory(item2);
        healer.addToInventory(item3);
        healer.removeFromInventory(item2);
        assertEquals(2, healer.getInventory().size());
    }

    @Test
    public void canLevelUp() {
        healer.levelUp();
        assertEquals(120, healer.getHealth());
        assertEquals(24, healer.getDamage());
        assertEquals(0, healer.getXp());
        assertEquals(2, healer.getLevel());
    }

    @Test
    public void canReduceHealth() {
        healer.defend(20);
        assertEquals(80, healer.getHealth());
    }

    @Test
    public void cannotReduceHealthBelowZero() {
        healer.defend(200);
        assertEquals(0, healer.getHealth());
    }

    @Test
    public void canChangeSpell() {
        healer.addToInventory(spell);
        healer.changeSpell(spell);
        assertEquals("Basic Heal", healer.getSpell().getName());
        assertEquals(25, healer.getSpell().getHealingPower());
    }

    @Test
    public void cannotEquipSpellNotInInventory() {
        healer.changeSpell(spell);
        assertNull(healer.getSpell());
    }

    @Test
    public void canUnequipSpell() {
        healer.addToInventory(spell);
        healer.changeSpell(spell);
        healer.unequipSpell();
        assertNull(healer.getSpell());
    }

    @Test
    public void canGetHealed() {
        healer.defend(50);
        healer.getHealed(30);
        assertEquals(80, healer.getHealth());
    }

    @Test
    public void cannotHealBeyondMaxHealth() {
        healer.defend(50);
        healer.getHealed(200);
        assertEquals(100, healer.getHealth());
    }

    @Test
    public void canHealHeroes() {
        Melee hero = new Melee(100, 10, 1);
        hero.defend(50);
        healer.addToInventory(spell);
        healer.changeSpell(spell);
        healer.heal(hero);
        assertEquals(75, hero.getHealth());
    }

    @Test
    public void cannotHealHeroesWithoutSpell() {
        Melee hero = new Melee(100, 10, 1);
        hero.defend(50);
        healer.heal(hero);
        assertEquals(50, hero.getHealth());
    }
}
