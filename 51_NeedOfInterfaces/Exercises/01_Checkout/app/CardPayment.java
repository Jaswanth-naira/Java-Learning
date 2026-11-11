package app;
public class CardPayment implements PaymentMethod 
{
       private static final int FEE_PERCENT = 2;
       private static final int PERCENT = 100;
       
       @Override
       public String name()
       {
        return "Card";
       }
       
       @Override 
       public int fee(int amount)
       {
        return amount * FEE_PERCENT/ PERCENT;
       }

}
