import characters.heroes.Mage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {
    private Mage mage;

    @Before
    public void before() {
        mage = new Mage(100, 20, 1);
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
        mage.addToInventory("Healing potion");
        assertEquals(1, mage.getInventory().size());
    }

    @Test
    public void canRemoveFromInventory() {
        mage.addToInventory("Healing potion");
        mage.addToInventory("Sword");
        mage.addToInventory("Diamond");
        mage.removeFromInventory("Sword");
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
    public void canReduceHealth() {
        mage.reduceHealth(20);
        assertEquals(80, mage.getHealth());
    }
}
