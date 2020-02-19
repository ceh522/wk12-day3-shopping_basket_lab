import java.util.ArrayList;

public class BuyOneGetOneFreeDiscount implements IDiscount {

    public double discountedAmount(ArrayList<Item> items, double total) {
        return total;
    }

}
