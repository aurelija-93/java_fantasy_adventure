import characters.enemies.Boss;
import characters.enemies.Monster;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RoomTest {
    private Room room;
    private Monster monster;
    private Monster monster1;
    private Monster monster2;
    private Boss boss;

    @Before
    public void before() {
        boss = new Boss(1000, 100, 500, 1);
        room = new Room(boss);
    }

    @Test
    public void startsWithNoMonsters() {
        assertEquals(0, room.getMonsters().size());
    }

    @Test
    public void startsWithNoTreasure() {
        assertEquals(0, room.getTreasure().size());
    }

    @Test
    public void canAddMonsters() {
        monster = new Monster(100, 10, 50, 1);
        room.addMonster(monster);
        assertEquals(1, room.getMonsters().size());
    }

    @Test
    public void canRemoveMonsters() {
        monster1 = new Monster(100, 10, 50, 1);
        monster2 = new Monster(200, 20, 100, 2);
        room.addMonster(monster1);
        room.addMonster(monster2);
        room.removeMonster(monster2);
        assertEquals(1, room.getMonsters().size());
    }

    @Test
    public void canRemoveBoss() {
        room.removeBoss();
        assertNull(room.getBoss());
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
