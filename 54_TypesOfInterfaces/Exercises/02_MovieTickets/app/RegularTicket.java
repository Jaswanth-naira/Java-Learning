package app;
public class RegularTicket implements Ticket
{
     private static final int TICKET_PRICE = 200;
     private final String seat;
     
     public RegularTicket(String seat)
     {
        this.seat = seat;
     }

     @Override 
     public String seat()
     {
        return seat;
     }

     @Override 
     public int price()
     {
        return TICKET_PRICE;
     }

}