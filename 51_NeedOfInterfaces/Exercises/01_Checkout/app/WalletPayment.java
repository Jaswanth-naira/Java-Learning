package app;
public class WalletPayment implements PaymentMethod 
{
     private final static int FLAT_FEE = 5;
     
     @Override
     public String name()
     {
        return "Wallet";
     }
     
     @Override
     public int fee(int amount)
     {
        return FLAT_FEE;
     }

}