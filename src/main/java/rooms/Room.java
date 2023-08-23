package rooms;

import enemies.Enemy;

import java.util.ArrayList;
import java.util.Collection;

public class Room {
    private ArrayList<Enemy> enemies;
    private ArrayList<String> treasure;

    public Room(ArrayList<Enemy> enemies, ArrayList<String> treasure) {
        this.enemies = enemies;
        this.treasure = treasure;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<String> getTreasure() {
        return treasure;
    }
}
