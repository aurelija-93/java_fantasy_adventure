package items;

public abstract class AttackItem extends Item {
    private int damage;
    public AttackItem(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
