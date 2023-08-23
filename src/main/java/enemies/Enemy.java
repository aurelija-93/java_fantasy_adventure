package enemies;

public class Enemy {
    private long health;
    private int damage;
    private int xp;

    public Enemy(long health, int damage, int xp) {
        this.health = health;
        this.damage = damage;
        this.xp = xp;
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

    public void reduceHealth(long amount) {
        health -= amount;
    }

    public void levelUp() {
        health = health + (health / 5);
        damage = damage + (damage / 5);
        xp = xp + (xp / 5);
    }
}
