import characters.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void before() {
        enemy = new Enemy(100, 10, 50, 1);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, enemy.getHealth());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, enemy.getDamage());
    }

    @Test
    public void hasXp() {
        assertEquals(50, enemy.getXp());
    }

    @Test
    public void canReduceHealth() {
        enemy.reduceHealth(30);
        assertEquals(70, enemy.getHealth());
    }

    @Test
    public void canLevelUp() {
        enemy.levelUp();
        assertEquals(120, enemy.getHealth());
        assertEquals(12, enemy.getDamage());
        assertEquals(60, enemy.getXp());
        assertEquals(2, enemy.getLevel());
    }

    @Test
    public void levelUpRoundsCorrectly() {
        enemy.levelUp();
        enemy.levelUp();
        assertEquals(144, enemy.getHealth());
        assertEquals(14, enemy.getDamage());
        assertEquals(72, enemy.getXp());
        assertEquals(3, enemy.getLevel());
    }
}
