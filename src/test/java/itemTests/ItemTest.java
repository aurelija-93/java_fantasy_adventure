package itemTests;

import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    private Item item;

    @Before
    public void before() {
        item = new Item("Feather");
    }

    @Test
    public void hasName() {
        assertEquals("Feather", item.getName());
    }
}
