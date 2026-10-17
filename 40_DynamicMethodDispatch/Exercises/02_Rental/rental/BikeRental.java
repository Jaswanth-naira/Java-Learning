package rental;
public class BikeRental extends Rental
{
    public BikeRental(String name, int noOfDays)
    {
        super(name,noOfDays);
    }
   
    @Override 
    protected int dailyRate()
    {
        return 300;
    }

    @Override
    protected int discountPercent()
    {
        if(isLongTerm()) return 20;
        return 0;
    }
}