package rooms;

import characters.Enemy;

import java.util.ArrayList;

public class Room {
    private ArrayList<Enemy> enemies;
    private ArrayList<String> treasure;

    public Room() {
        this.enemies = new ArrayList<>();
        this.treasure = new ArrayList<>();
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<String> getTreasure() {
        return treasure;
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }

    public void addTreasure(String item) {
        treasure.add(item);
    }

    public void removeTreasure(String item) {
        treasure.remove(item);
    }
}
