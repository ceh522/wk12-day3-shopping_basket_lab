import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item> items;
    private double total;

    public ShoppingBasket() {
        this.items = new ArrayList<Item>();
        this.total = 0;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.getPrice();
    }

    public void removeItem(Item item) {
        this.items.remove(item);
        this.total -= item.getPrice();
    }

    public void empty() {
        this.items.clear();
        this.total = 0;
    }
}
