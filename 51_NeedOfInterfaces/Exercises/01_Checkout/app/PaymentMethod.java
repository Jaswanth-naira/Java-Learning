package app;
public interface PaymentMethod
{
    String name();
    int fee(int amount);
}