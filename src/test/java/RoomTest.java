import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    private Room room;
    private ArrayList<Enemy> enemies;
    private Enemy enemy;
    private ArrayList<String> treasure;

    @Before
    public void before() {
        enemies = new ArrayList<>();
        treasure = new ArrayList<>();
        room = new Room(enemies, treasure);
    }

    @Test
    public void startsWithNoEnemies() {
        assertEquals(0, room.getEnemies().size());
    }

    @Test
    public void startsWithNoTreasure() {
        assertEquals(0, room.getTreasure().size());
    }
}
