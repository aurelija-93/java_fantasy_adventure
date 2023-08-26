package characters.enemies;

import characters.Character;
import characters.IAttack;

public abstract class Enemy extends Character implements IAttack {

    public Enemy(int health, int damage, int xp, int level) {
        super(health, damage, xp, level);
    }

    public void levelUp() {
        int newHealth = getHealth() + (getHealth() / 5);
        setHealth(newHealth);

        int newDamage = getDamage() + (getDamage() / 5);
        setDamage(newDamage);

        int newXp = getXp() + (getXp() / 5);
        setXp(newXp);

        setLevel(getLevel() + 1);
    }

    @Override
    public void attack(Character character) {
        character.defend(getDamage());
    }
}
