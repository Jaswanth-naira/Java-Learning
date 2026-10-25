package tickets;
public class Ticket 
{
    private final String id;
    private final int basePrice;


    public Ticket(String id, int basePrice)
    {
        this.id = id;
        this.basePrice = basePrice;
    }

    public String getId()
    {
        return id;
    }

    public int getBasePrice()
    {
        return basePrice;
    }

    public int getPrice()
    {
        return basePrice;
    }
}