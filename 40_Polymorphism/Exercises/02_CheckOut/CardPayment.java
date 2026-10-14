// File 2: CardPayment.java 
public class CardPayment extends Payment 
{
    public CardPayment(int amount)
    {
        super(amount);
    }

    @Override 
    public int getFee()
    {
        return (getAmount() * 2/100);
    }
}