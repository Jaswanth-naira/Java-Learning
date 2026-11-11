package app;
public class UpiPayment implements PaymentMethod 
{
       @Override
       public String name()
       {
        return "UPI";
       }
       
       @Override 
       public int fee(int amount)
       {
        return 0;
       }

}
