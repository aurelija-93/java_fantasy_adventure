package characters;

public class Monster extends Character implements ILevelUp {


    public Monster(long health, int damage, int xp, int level) {
        super(health, damage, xp, level);
    }

    public void levelUp() {
        health = health + (health / 5);
        damage = damage + (damage / 5);
        xp = xp + (xp / 5);
    }
}
