import java.util.ArrayList;

public class PercentageDiscount implements IDiscount {

    private double percentageDiscountedAsDecimal;
    private ShoppingBasket shoppingBasket;


    public PercentageDiscount(double percentageDiscountedAsDecimal, ShoppingBasket shoppingBasket) {
        this.percentageDiscountedAsDecimal = percentageDiscountedAsDecimal;
        this.shoppingBasket = shoppingBasket;
    }

    public double discountedAmount(ArrayList<Item> items, double total) {
        if (total > 20.0) {
            double discountedTotal = total - (total * percentageDiscountedAsDecimal);
            return discountedTotal;
        }
        return total;
    }
}
