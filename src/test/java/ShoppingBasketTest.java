import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket1;
    Item item1;
    Item item2;

    @Before
    public void before() {
        shoppingBasket1 = new ShoppingBasket();
        item1 = new Item("crisps", 1.0);
        item2 = new Item("bread", 2.0);
    }

    @Test
    public void startsWithNoItems() {
        assertEquals(0, shoppingBasket1.getItems().size());
    }

    @Test
    public void startsWithNoTotalValueOfItems() {
        assertEquals(0.0, shoppingBasket1.getTotal(), 0.01);
    }

    @Test
    public void canAddItemToShoppingBasket() {
        shoppingBasket1.addItem(item1);
        assertEquals(1, shoppingBasket1.getItems().size());
    }

    @Test
    public void totalIncreasesByPriceOfItemAddedToBasket() {
        shoppingBasket1.addItem(item1);
        assertEquals(1.0, shoppingBasket1.getTotal(), 0.01);
    }

    @Test
    public void canRemoveItemFromBasket() {
        shoppingBasket1.addItem(item1);
        shoppingBasket1.removeItem(item1);
        assertEquals(0, shoppingBasket1.getItems().size());
    }

    @Test
    public void totalDecreasesIfItemRemoved() {
        shoppingBasket1.addItem(item1);
        shoppingBasket1.removeItem(item1);
        assertEquals(0.0, shoppingBasket1.getTotal(), 0.01);
    }

    @Test
    public void canRemoveAllItemsFromBasket() {
        shoppingBasket1.addItem(item1);
        shoppingBasket1.addItem(item2);
        shoppingBasket1.empty();
        assertEquals(0, shoppingBasket1.getItems().size());
    }

    @Test
    public void totalZeroWhenBasketEmptied() {
        shoppingBasket1.addItem(item1);
        shoppingBasket1.addItem(item2);
        shoppingBasket1.empty();
        assertEquals(0.0, shoppingBasket1.getTotal(), 0.01);
    }
}
