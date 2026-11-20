package app;
public class BikeSpot extends ParkingSpot
{
    private static final int RATE_PER_HOUR = 10;

    @Override 
    public int hourlyRate()
    {
        return RATE_PER_HOUR;
    }

}