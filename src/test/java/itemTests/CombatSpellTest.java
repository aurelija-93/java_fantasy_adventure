package itemTests;

import items.CombatSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombatSpellTest {
    private CombatSpell spell;

    @Before
    public void before() {
        spell = new CombatSpell("Fireball", 30);
    }

    @Test
    public void hasName() {
        assertEquals("Fireball", spell.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(30, spell.getDamage());
    }
}
