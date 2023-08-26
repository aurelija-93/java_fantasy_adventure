package rooms;

import characters.enemies.Boss;
import characters.enemies.Monster;
import items.Item;

import java.util.ArrayList;

public class Room {
    private ArrayList<Monster> monsters;
    private Boss boss;
    private ArrayList<Item> treasure;

    public Room(Boss boss) {
        this.monsters = new ArrayList<>();
        this.boss = boss;
        this.treasure = new ArrayList<>();
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public Boss getBoss() {
        return boss;
    }

    public ArrayList<Item> getTreasure() {
        return treasure;
    }

    public void addMonster(Monster enemy) {
        monsters.add(enemy);
    }

    public void removeMonster(Monster enemy) {
        monsters.remove(enemy);
    }
    public void removeBoss() {
        boss = null;
    }

    public void addTreasure(Item item) {
        treasure.add(item);
    }

    public void removeTreasure(Item item) {
        treasure.remove(item);
    }
}
