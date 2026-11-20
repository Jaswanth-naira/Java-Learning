package app;
public class ParkingSpot 
{
    private static final int RATE_PER_HOUR = 40;
    public int hourlyRate()
    {
        return RATE_PER_HOUR;
    }

    @Deprecated(since = "2.0", forRemoval = true)
    public int rate()
    {
        return hourlyRate();
    }
    
    public int fee(int hours)
    {
        return hourlyRate() * hours;
    }

}