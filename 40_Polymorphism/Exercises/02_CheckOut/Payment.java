// File 1: Payment.java
public class Payment 
{
    private int amount;

    public Payment(int amount)
    {
        this.amount = amount;
    }

    public int getAmount()
    {
        return amount;
    }

    public int getFee()
    {
        return 0;
    }

    public int getTotal()
    {
        return getAmount() + getFee();
    }

    public int getTotal(int tip)
    {
        return getTotal() + tip;
    }
}