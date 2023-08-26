package characters.heroes;

import characters.Character;
import items.Item;

import java.util.ArrayList;

public abstract class Hero extends Character {
    private int gold;
    private ArrayList<Item> inventory;
    private int maxHealth;

    public Hero(
            int health,
            int damage,
            int level
    ) {
        super(health, damage, 0, level);
        this.gold = 100;
        this.inventory = new ArrayList<>();
        this.maxHealth = health;
    }

    public int getGold() {
        return gold;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void addGold(int amount) {
        gold += amount;
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public void removeFromInventory(Item item) {
        inventory.remove(item);
    }

    public void levelUp() {
        int newHealth = getHealth() + (getHealth() / 5);
        setHealth(newHealth);

        int newDamage = getDamage() + (getDamage() / 5);
        setDamage(newDamage);

        setXp(0);

        setLevel(getLevel() + 1);
    }

    public void getHealed(int healthPoints) {
        setHealth(Math.min(getHealth() + healthPoints, getMaxHealth()));
    }
}
