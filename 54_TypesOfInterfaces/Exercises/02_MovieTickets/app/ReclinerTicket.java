package app;
public class ReclinerTicket implements Ticket,Refundable
{
    private static final int TICKET_PRICE = 450;
    private final String seat;

    public ReclinerTicket(String seat)
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