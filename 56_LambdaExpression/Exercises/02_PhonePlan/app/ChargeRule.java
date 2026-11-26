package app;
@FunctionalInterface
public interface ChargeRule 
{
    int calculate(int minutes, int messages);
}