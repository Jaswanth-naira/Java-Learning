package app;
public class Main 
{
    public static void main(String[] args)
    {
        int[] amounts = { 1250, 99};
        Checkout[] checkouts = {
                                 new Checkout(new UpiPayment()),
                                 new Checkout(new CardPayment()),
                                 new Checkout(new WalletPayment())
        };

        for(Checkout checkout : checkouts)
        {
            for(int amount : amounts)
            {
                System.out.println(checkout.paymentName() + " total for " + amount + ": " + checkout.totalFor(amount));
            }
        }
    }
}