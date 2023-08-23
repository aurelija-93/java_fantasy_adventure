import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void before() {
        enemy = new Enemy(100, 10, 50);
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
}
