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
}
