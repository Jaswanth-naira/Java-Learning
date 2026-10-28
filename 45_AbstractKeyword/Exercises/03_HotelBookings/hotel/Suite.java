package hotel;
public class Suite extends Booking 
{
    private final int extraGuests;
    private static final int BASE_RATE = 7000;
    private static final int RATE_PER_EXTRA_GUEST = 1000;
    private static final int CLEANING_FEE = 600;

    public Suite(String guestName, int nights, int extraGuests)
    {
        super(guestName,nights);
        this.extraGuests = extraGuests;
    }

    @Override
    int nightlyRate()
    {
        return BASE_RATE + (RATE_PER_EXTRA_GUEST * extraGuests);
    }

    @Override
    int cleaningFee()
    {
        return CLEANING_FEE;
    }
}