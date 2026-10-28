package hotel;
public abstract class Booking 
{
    private final String guestName;
    private final int nights;
    private static final int CLEANING_FEE = 300;

    public Booking(String guestName, int nights)
    {
        this.guestName = guestName;
        this.nights = nights;
    }

    public String getGuestName()
    {
        return guestName;
    }

    public int getNights() 
    {
        return nights;
    }

    abstract int nightlyRate();

    int cleaningFee()
    {
        return CLEANING_FEE;
    }

    public final int totalCost()
    {
        return nightlyRate() * nights + cleaningFee();
    }

    public boolean costsMoreThan(Booking other)
    {
          if(other == null) return false;
          return this.totalCost() > other.totalCost();
    }
}