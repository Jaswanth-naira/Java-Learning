package store;

public class PerishableItem extends Item {
    private final int daysToExpiry;

    public PerishableItem(String code, String name, int price, int daysToExpiry) {
        super(code, name, price);
        this.daysToExpiry = daysToExpiry;
    }

    @Override
    public String toString() {
        return super.toString() + " (exp " + daysToExpiry + "d)";
    }
}