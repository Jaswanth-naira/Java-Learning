package hotel;
public class StandardRoom extends Booking  
{   
    private static final int NIGHTLY_RATE = 2500;
    public StandardRoom(String guestName, int nights)
    {
        super(guestName,nights);
    }

    @Override 
    int nightlyRate()
    {
        return NIGHTLY_RATE;
    }
}