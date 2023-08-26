package characters;

import java.util.ArrayList;

public class Hero extends Character {
    private long health;
    private int damage;
    private long gold;
    private ArrayList<String> inventory;

    public Hero(
            long health,
            int damage,
            int level
    ) {
        super(health, damage, 0, level);
        this.gold = 100;
        this.inventory = new ArrayList<>();
    }

    public long getGold() {
        return gold;
    }

    public ArrayList<String> getInventory() {
        return inventory;
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
        setXp(0);
        setLevel(getLevel() + 1);
    }
}
