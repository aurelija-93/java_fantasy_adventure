import heroes.Hero;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HeroTest {
    private Hero hero;
    private ArrayList<String> inventory;

    @Before
    public void before() {
        inventory = new ArrayList<>();
        hero = new Hero(100, 20, 50, 1, 70, inventory);
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
    public void hasXp() {
        assertEquals(50, hero.getXp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, hero.getLevel());
    }

    @Test
    public void hasGold() {
        assertEquals(70, hero.getGold());
    }

    @Test
    public void inventoryStartsEmpty() {
        assertEquals(0, hero.getInventory().size());
    }

    @Test
    public void canAddToInventory() {
        hero.addToInventory("Healing potion");
        assertEquals(1, hero.getInventory().size());
    }
}
