package items;

public class Armour extends Item {
    private String name;
    private int armourStrength;

    public Armour(String name, int armourStrength) {
        super(name);
        this.armourStrength = armourStrength;
    }

    public int getArmourStrength() {
        return armourStrength;
    }

    public void setArmourStrength(int armourStrength) {
        this.armourStrength = armourStrength;
    }
}
