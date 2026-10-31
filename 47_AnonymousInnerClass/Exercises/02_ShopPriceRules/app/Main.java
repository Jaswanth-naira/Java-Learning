package app;
import billing.PriceRule;
import billing.Shop;

public class Main {
    public static void main(String[] args) {
        Shop cornerStore = new Shop(10);
        Shop megaMart = new Shop(20);

        PriceRule noOffer = new PriceRule();
        System.out.println("No offer: " + noOffer.apply(1000));

        PriceRule cornerMember = cornerStore.memberRule();
        System.out.println("Corner member: " + cornerMember.apply(1000));

        PriceRule megaMember = megaMart.memberRule();
        System.out.println("Mega member: " + megaMember.apply(1000));
        PriceRule fiftyOff = Shop.flatOff(50);

        System.out.println("Fifty off 1000: " + fiftyOff.apply(1000));
        System.out.println("Fifty off 30: " + fiftyOff.apply(30));

        System.out.println("Corner total: " + Shop.finalAmount(1000, new PriceRule[] { cornerMember, fiftyOff }));

        System.out.println("Mega total: " + Shop.finalAmount(1000, new PriceRule[] { fiftyOff, megaMember }));

        System.out.println("Rounded total: " + Shop.finalAmount(1234, new PriceRule[] {
            new PriceRule() {
                @Override
                public int apply(int amount) {
                    return (amount / 100) * 100;
                }
            },
            cornerMember
        }));
        System.out.println("Empty total: " + Shop.finalAmount(500, new PriceRule[] {}));
    }
}