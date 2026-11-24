package app;
public class AppPricing implements OnlinePricing 
{
      private static final int CONVENIENCE_FEE = 30;

      @Override 
      public int convenienceFee()
      {
         return CONVENIENCE_FEE;
      }

      @Override 
      public int finalPrice(Ticket ticket)
      {
          if(ticket == null) return 0;
          return ticket.price() + convenienceFee();
      }
      
}