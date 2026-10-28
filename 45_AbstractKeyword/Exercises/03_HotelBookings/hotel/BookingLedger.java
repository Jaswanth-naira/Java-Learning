package hotel;
public class BookingLedger 
{
    private final Booking[] bookings;
    private static final int LONG_STAY_NIGHTS = 5;

    public BookingLedger(Booking[] bookings)
    {
        this.bookings = bookings != null ? bookings : new Booking[0];
    }

    public int totalRevenue() 
    {
        int sum = 0;
        for(Booking booking: bookings)
        {
            if (booking != null) sum += booking.totalCost();
        }
        return sum;
    }

    public Booking findMostExpensive()
    {
        Booking expensiveBooking = null;
        for(Booking booking: bookings)
        {
             if(booking !=  null)
             {
                if(expensiveBooking == null || booking.costsMoreThan(expensiveBooking)) expensiveBooking = booking;
             }
        }
       return expensiveBooking;
    }

    public int countLongStays()
    {
        int count = 0;
        for(Booking booking: bookings)
        {
            if(booking != null && booking.getNights() >= LONG_STAY_NIGHTS ) count++;
        }

        return count;
    }
}