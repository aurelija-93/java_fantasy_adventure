package itemTests;

import items.HealingSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingSpellTest {
    private HealingSpell spell;

    @Before
    public void before() {
        spell = new HealingSpell("Healing Wave", 50);
    }

    @Test
    public void hasName() {
        assertEquals("Healing Wave", spell.getName());
    }

    @Test
    public void hasHealingPower() {
        assertEquals(50, spell.getHealingPower());
    }
}
