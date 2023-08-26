package roomTests;

import characters.enemies.Boss;
import characters.enemies.Monster;
import items.Item;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RoomTest {
    private Room room;
    private Boss boss;

    private Item item1;

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
        Monster monster = new Monster(100, 10, 50, 1);
        room.addMonster(monster);
        assertEquals(1, room.getMonsters().size());
    }

    @Test
    public void canRemoveMonsters() {
        Monster monster1 = new Monster(100, 10, 50, 1);
        Monster monster2 = new Monster(200, 20, 100, 2);
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
        item1 = new Item("Healing potion");
        room.addTreasure(item1);
        assertEquals(1, room.getTreasure().size());
    }

    @Test
    public void canRemoveTreasure() {
        item1 = new Item("Healing potion");
        Item item2 = new Item("Sword");
        Item item3 = new Item("Diamond");
        room.addTreasure(item1);
        room.addTreasure(item2);
        room.addTreasure(item3);
        room.removeTreasure(item2);
        assertEquals(2, room.getTreasure().size());
    }
}
