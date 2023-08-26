package characters.enemies;

import java.util.ArrayList;

public class Boss extends Enemy {

    private ArrayList<String> loot;
    public Boss(long health, int damage, int xp, int level) {
        super(health, damage, xp, level);
        this.loot = new ArrayList<>();
    }

    public ArrayList<String> getLoot() {
        return loot;
    }

    public void addToLoot(String item) {
        loot.add(item);
    }
}
