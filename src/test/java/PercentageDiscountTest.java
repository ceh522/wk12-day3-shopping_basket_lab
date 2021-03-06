import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PercentageDiscountTest {

    PercentageDiscount percentageDiscount;
    ShoppingBasket shoppingBasket1;
    Item item1;
    Item item2;


    @Before
    public void before() {
        shoppingBasket1 = new ShoppingBasket();
        item1 = new Item("pillows", 10.0);
        item2 = new Item("cutlery", 20.0);
        shoppingBasket1.addItem(item1);
        shoppingBasket1.addItem(item2);
        percentageDiscount = new PercentageDiscount(0.1, shoppingBasket1);
    }

    @Test
    public void checkCorrectTotalOnceDiscountApplied() {
        assertEquals(27.0, percentageDiscount.discountedAmount(shoppingBasket1.getItems(), shoppingBasket1.getTotal()));
    }



}
