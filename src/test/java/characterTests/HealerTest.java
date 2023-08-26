package characterTests;

import characters.heroes.Healer;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {
    private Healer healer;
    private Item item1;
    private Item item2;
    private Item item3;

    @Before
    public void before() {
        healer = new Healer(100, 20, 1);
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
        item2 = new Item("Sword");
        item3 = new Item("Diamond");
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
        healer.reduceHealth(20);
        assertEquals(80, healer.getHealth());
    }
}
