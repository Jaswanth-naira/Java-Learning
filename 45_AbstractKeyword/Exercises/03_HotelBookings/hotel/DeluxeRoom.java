package hotel;
public class DeluxeRoom extends Booking 
{
    private static final int NIGHTLY_RATE = 4000;
    public DeluxeRoom(String guestName, int nights)
    {
        super(guestName,nights);
    }

    @Override 
    int nightlyRate()
    {
        return NIGHTLY_RATE;
    }
}