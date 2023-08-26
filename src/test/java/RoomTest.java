import characters.Enemy;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    private Room room;
    private Enemy enemy;
    private Enemy enemy1;
    private Enemy enemy2;

    @Before
    public void before() {
        room = new Room();
    }

    @Test
    public void startsWithNoEnemies() {
        assertEquals(0, room.getEnemies().size());
    }

    @Test
    public void startsWithNoTreasure() {
        assertEquals(0, room.getTreasure().size());
    }

    @Test
    public void canAddEnemies() {
        enemy = new Enemy(100, 10, 50, 1);
        room.addEnemy(enemy);
        assertEquals(1, room.getEnemies().size());
    }

    @Test
    public void canRemoveEnemies() {
        enemy1 = new Enemy(100, 10, 50, 1);
        enemy2 = new Enemy(200, 20, 100, 2);
        room.addEnemy(enemy1);
        room.addEnemy(enemy2);
        room.removeEnemy(enemy2);
        assertEquals(1, room.getEnemies().size());
    }

    @Test
    public void canAddTreasure() {
        room.addTreasure("Healing potion");
        assertEquals(1, room.getTreasure().size());
    }

    @Test
    public void canRemoveTreasure() {
        room.addTreasure("Healing potion");
        room.addTreasure("Sword");
        room.addTreasure("Diamond");
        room.removeTreasure("Sword");
        assertEquals(2, room.getTreasure().size());
    }
}
