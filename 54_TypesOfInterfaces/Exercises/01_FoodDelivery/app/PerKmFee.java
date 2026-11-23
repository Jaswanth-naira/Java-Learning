package app;
public class PerKmFee implements DeliveryFee 
{
    private static final int RATE_PER_KM = 15;
    
    @Override 
    public int fee(int distanceKm)
    {
        return RATE_PER_KM * distanceKm;
    }
}