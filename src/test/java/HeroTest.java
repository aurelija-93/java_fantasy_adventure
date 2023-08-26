import characters.Hero;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {
    private Hero hero;

    @Before
    public void before() {
        hero = new Hero(100, 20, 1);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, hero.getHealth());
    }

    @Test
    public void hasDamage() {
        assertEquals(20, hero.getDamage());
    }

    @Test
    public void startsWithNoXp() {
        assertEquals(0, hero.getXp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, hero.getLevel());
    }

    @Test
    public void startsWith100Gold() {
        assertEquals(100, hero.getGold());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, hero.getInventory().size());
    }

    @Test
    public void canAddGold() {
        hero.addGold(50);
        assertEquals(150, hero.getGold());
    }

    @Test
    public void canAddXp() {
        hero.addXp(10);
        assertEquals(60, hero.getXp());
    }

    @Test
    public void canAddToInventory() {
        hero.addToInventory("Healing potion");
        assertEquals(1, hero.getInventory().size());
    }

    @Test
    public void canRemoveFromInventory() {
        hero.addToInventory("Healing potion");
        hero.addToInventory("Sword");
        hero.addToInventory("Diamond");
        hero.removeFromInventory("Sword");
        assertEquals(2, hero.getInventory().size());
    }

    @Test
    public void canLevelUp() {
        hero.levelUp();
        assertEquals(120, hero.getHealth());
        assertEquals(24, hero.getDamage());
        assertEquals(0, hero.getXp());
        assertEquals(2, hero.getLevel());
    }

    @Test
    public void canReduceHealth() {
        hero.reduceHealth(20);
        assertEquals(80, hero.getHealth());
    }
}
