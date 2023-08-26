package characters;

public class Monster extends Character{

    public Monster(long health, int damage, int xp, int level) {
        super(health, damage, xp, level);
    }

    public void levelUp() {
        long newHealth = getHealth() + (getHealth() / 5);
        setHealth(newHealth);

        int newDamage = getDamage() + (getDamage() / 5);
        setDamage(newDamage);

        int newXp = getXp() + (getXp() / 5);
        setXp(newXp);

        setLevel(getLevel() + 1);
    }
}
