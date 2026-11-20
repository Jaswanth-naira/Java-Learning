package app;
public class EvSpot extends ParkingSpot 
{
    private static final int RATE_PER_HOUR = 60;

    @Override
    public int hourlyRate()
    {
       return RATE_PER_HOUR;
    }

}