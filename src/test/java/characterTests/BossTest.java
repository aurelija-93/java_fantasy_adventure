package characterTests;

import characters.enemies.Boss;
import characters.heroes.Mage;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BossTest {
    private Boss boss;

    @Before
    public void before() {
        boss = new Boss(100, 10, 50, 1);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, boss.getHealth());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, boss.getDamage());
    }

    @Test
    public void hasXp() {
        assertEquals(50, boss.getXp());
    }

    @Test
    public void startsWithNoLoot() {
        assertEquals(0, boss.getLoot().size());
    }

    @Test
    public void canAddToLoot() {
        Item item = new Item("Helmet");
        boss.addToLoot(item);
        assertEquals(1, boss.getLoot().size());
    }

    @Test
    public void canDefend() {
        boss.defend(30);
        assertEquals(70, boss.getHealth());
    }

    @Test
    public void canLevelUp() {
        boss.levelUp();
        assertEquals(120, boss.getHealth());
        assertEquals(12, boss.getDamage());
        assertEquals(60, boss.getXp());
        assertEquals(2, boss.getLevel());
    }

    @Test
    public void levelUpRoundsCorrectly() {
        boss.levelUp();
        boss.levelUp();
        assertEquals(144, boss.getHealth());
        assertEquals(14, boss.getDamage());
        assertEquals(72, boss.getXp());
        assertEquals(3, boss.getLevel());
    }

    @Test
    public void canAttack() {
        Mage hero = new Mage(100, 10, 1);
        boss.attack(hero);
        assertEquals(90, hero.getHealth());
    }
}
