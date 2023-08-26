package items;

public class HealingSpell extends Item {

    private int healingPower;
    public HealingSpell(String name, int healingPower) {
        super(name);
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
