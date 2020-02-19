import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ItemTest {

    Item item1;

    @Before
    public void before() {
        item1 = new Item("crisps", 1.0);
    }

    @Test
    public void hasName(){
        assertEquals("crisps", item1.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(1.0, item1.getPrice(), 0.01);
    }
}
