package app;
public class ComboTicket extends ReclinerTicket
{
     private static final int TICKET_PRICE = 600;

     public ComboTicket(String seat)
     {
        super(seat);
     }

     @Override 
     public int price()
     {
        return TICKET_PRICE;
     }

}