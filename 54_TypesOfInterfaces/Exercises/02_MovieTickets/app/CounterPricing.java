package app;
public class CounterPricing implements Pricing 
{
     @Override
     public int finalPrice(Ticket ticket)
     {
          if(ticket == null) return 0;
          return ticket.price();
     }
}