package rental;
public class CarRental extends Rental 
{
    private boolean hasDriver;   
    
    public CarRental(String name, int noOfDays, boolean driver)
    {
      super(name,noOfDays);
      this.hasDriver = driver;
    }

    
    @Override
    protected int dailyRate()
    {
        return 1200;
    }

    @Override 
    protected int discountPercent()
    {
        if (isLongTerm()) return 10;
        return 0;
    }

    @Override 
    public int total()
    {
        int amount = super.total();
        
        if(hasDriver)
        {
         amount += getNoOfDays() * 300; 
        }

        return amount;
    }
}