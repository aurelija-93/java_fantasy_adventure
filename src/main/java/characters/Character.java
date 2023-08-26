package characters;

public abstract class Character implements ILevelUp {
    private long health;
    private int damage;
    private int xp;
    private int level;

    public Character(long health, int damage, int xp, int level) {
        this.health = health;
        this.damage = damage;
        this.xp = xp;
        this.level = level;
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

    public void setHealth(long health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void addXp(int points) {
        xp += points;
    }

    public void reduceHealth(long amount) {
        health -= amount;
    }
}
