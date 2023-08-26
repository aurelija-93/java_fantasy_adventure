package rooms;

import characters.enemies.Monster;

import java.util.ArrayList;

public class Room {
    private ArrayList<Monster> monsters;
    private ArrayList<String> treasure;

    public Room() {
        this.monsters = new ArrayList<>();
        this.treasure = new ArrayList<>();
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public ArrayList<String> getTreasure() {
        return treasure;
    }

    public void addMonster(Monster enemy) {
        monsters.add(enemy);
    }

    public void removeMonster(Monster enemy) {
        monsters.remove(enemy);
    }

    public void addTreasure(String item) {
        treasure.add(item);
    }

    public void removeTreasure(String item) {
        treasure.remove(item);
    }
}
