package characters;

public abstract class Character implements ILevelUp {
    private int health;
    private int damage;
    private int xp;
    private int level;

    public Character(int health, int damage, int xp, int level) {
        this.health = health;
        this.damage = damage;
        this.xp = xp;
        this.level = level;
    }

    public int getHealth() {
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

    public void setHealth(int health) {
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

    public void reduceHealth(int amount) {
        health = Math.max(health - amount, 0);
    }
}
