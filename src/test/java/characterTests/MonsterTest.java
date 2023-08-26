package characterTests;

import characters.enemies.Monster;
import characters.heroes.Mage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonsterTest {
    private Monster monster;

    @Before
    public void before() {
        monster = new Monster(100, 10, 50, 1);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, monster.getHealth());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, monster.getDamage());
    }

    @Test
    public void hasXp() {
        assertEquals(50, monster.getXp());
    }

    @Test
    public void canDefend() {
        monster.defend(30);
        assertEquals(70, monster.getHealth());
    }

    @Test
    public void canLevelUp() {
        monster.levelUp();
        assertEquals(120, monster.getHealth());
        assertEquals(12, monster.getDamage());
        assertEquals(60, monster.getXp());
        assertEquals(2, monster.getLevel());
    }

    @Test
    public void levelUpRoundsCorrectly() {
        monster.levelUp();
        monster.levelUp();
        assertEquals(144, monster.getHealth());
        assertEquals(14, monster.getDamage());
        assertEquals(72, monster.getXp());
        assertEquals(3, monster.getLevel());
    }

    @Test
    public void canAttack() {
        Mage hero = new Mage(100, 10, 1);
        monster.attack(hero);
        assertEquals(90, hero.getHealth());
    }
}
