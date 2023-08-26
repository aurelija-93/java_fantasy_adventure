package itemTests;

import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Sword", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Sword", weapon.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, weapon.getDamage());
    }
}
