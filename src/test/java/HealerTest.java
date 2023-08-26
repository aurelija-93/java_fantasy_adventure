import characters.heroes.Healer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {
    private Healer healer;

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
        healer.addToInventory("Healing potion");
        assertEquals(1, healer.getInventory().size());
    }

    @Test
    public void canRemoveFromInventory() {
        healer.addToInventory("Healing potion");
        healer.addToInventory("Sword");
        healer.addToInventory("Diamond");
        healer.removeFromInventory("Sword");
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
