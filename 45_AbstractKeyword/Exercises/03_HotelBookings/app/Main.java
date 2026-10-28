package app;
import hotel.*;
public class Main 
{
    public static void main(String[] args)
    {
        Booking[] bookings = {
                               new StandardRoom("Kiran",3),
                               new Suite("Meera",2,1),
                               new DeluxeRoom("Arjun",5),
                               new StandardRoom("Divya",7)
                             };
        for(Booking booking: bookings)
        {
            System.out.println(booking.getGuestName() + ": "  + booking.totalCost());
        }

        boolean meeraCostsMore = bookings[1].costsMoreThan(bookings[3]);
        System.out.println("Meera costs more than Divya: " + meeraCostsMore);

        BookingLedger ledger = new BookingLedger(bookings);
        System.out.println("Total revenue: " + ledger.totalRevenue());
        
        Booking mostExpensive =  ledger.findMostExpensive();
        String expensiveName = (mostExpensive != null) ? mostExpensive.getGuestName() : "none";
        System.out.println("Most expensive: " + expensiveName);

        System.out.println("Long stays: " + ledger.countLongStays());   

        BookingLedger emptyLedger = new BookingLedger(new Booking[0]);
        System.out.println("Empty ledger revenue: " + emptyLedger.totalRevenue());

        Booking emptyMostExpensive = emptyLedger.findMostExpensive();
        String emptyExpensiveName = ( emptyMostExpensive != null) ? emptyMostExpensive.getGuestName() : "none";
        System.out.println("Empty ledger most expensive: " + emptyExpensiveName);
    }
}