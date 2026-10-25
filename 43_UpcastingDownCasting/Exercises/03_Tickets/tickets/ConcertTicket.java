package tickets;
public class ConcertTicket extends Ticket
{
    private static final int FRONT_ROW_LIMIT = 3;
    private final int row;

    public ConcertTicket(String id, int basePrice, int row)
    {
        super(id,basePrice);
        this.row = row;
    }

    public int getRow()
    {
        return row;
    }
    
    public boolean isFrontRow()
    {
        return row <= FRONT_ROW_LIMIT;
    }

    @Override 
    public int getPrice()
    {
        return isFrontRow() ? getBasePrice() * 2 : getBasePrice();
    }
}