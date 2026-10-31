package billing;

public class Shop {
    private final int memberDiscountPercent;

    public Shop(int memberDiscountPercent) {
        this.memberDiscountPercent = memberDiscountPercent;
    }

    public PriceRule memberRule() {
        return new PriceRule() {
            @Override
            public int apply(int amount) {
                return amount - (amount * memberDiscountPercent / 100);
            }
        };
    }

    public static PriceRule flatOff(int amountOff) {
        return new PriceRule() {
            @Override
            public int apply(int amount) {
                int remaining = amount - amountOff;
                return remaining < 0 ? 0 : remaining;
            }
        };
    }

    public static int finalAmount(int amount, PriceRule[] rules) {
        int current = amount;
        for (PriceRule rule : rules) {
            current = rule.apply(current);
        }
        return current;
    }
}