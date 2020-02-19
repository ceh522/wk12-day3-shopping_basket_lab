import java.util.ArrayList;

public class LoyaltyCardDiscount implements IDiscount {

    private double loyaltyCardPercentageDiscountedAsDecimal;
    private ShoppingBasket shoppingBasket;


    public LoyaltyCardDiscount(double loyaltyCardPercentageDiscountedAsDecimal, ShoppingBasket shoppingBasket) {
        this.loyaltyCardPercentageDiscountedAsDecimal = loyaltyCardPercentageDiscountedAsDecimal;
        this.shoppingBasket = shoppingBasket;
    }

    public double discountedAmount(ArrayList<Item> items, double total) {
        double discountedTotal = total - (total * loyaltyCardPercentageDiscountedAsDecimal);
        return discountedTotal;
    }
}

