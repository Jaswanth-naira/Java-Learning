package app;
public class Checkout 
{
    private final PaymentMethod paymentMethod;

    public Checkout(PaymentMethod paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }
    
    public String paymentName()
    {
        return paymentMethod.name();
    }

    public int totalFor(int amount)
    {
        return paymentMethod.fee(amount) + amount;
    }

}