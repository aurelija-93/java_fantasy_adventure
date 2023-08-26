package characters.enemies;

import items.Item;

import java.util.ArrayList;

public class Boss extends Enemy {

    private ArrayList<Item> loot;
    public Boss(long health, int damage, int xp, int level) {
        super(health, damage, xp, level);
        this.loot = new ArrayList<>();
    }

    public ArrayList<Item> getLoot() {
        return loot;
    }

    public void addToLoot(Item item) {
        loot.add(item);
    }
}
