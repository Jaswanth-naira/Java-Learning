package app;
public class BoxOffice 
{
    public int refundFor(Ticket ticket)
    {
        if(ticket instanceof Refundable)
        {
            return ticket.price();
        }
        return 0;
    }
}