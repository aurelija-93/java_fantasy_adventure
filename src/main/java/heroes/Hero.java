package heroes;

import java.util.ArrayList;
import java.util.Collection;

public class Hero {
    private long health;
    private int damage;
    private int xp;
    private int level;
    private long gold;
    private ArrayList<String> inventory;

    public Hero(long health, int damage, int xp, int level, long gold, ArrayList<String> inventory) {
        this.health = health;
        this.damage = damage;
        this.xp = xp;
        this.level = level;
        this.gold = gold;
        this.inventory = inventory;
    }

    public long getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public long getGold() {
        return gold;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void addXp(int points) {
        xp += points;
    }

    public void addGold(long amount) {
        gold += amount;
    }

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void removeFromInventory(String item) {
        inventory.remove(item);
    }

    public void levelUp() {
        health = health + (health / 5);
        damage = damage + (damage / 5);
        xp = 0;
        level += 1;
    }
}
