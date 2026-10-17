package rental;
public class Rental 
{
    private String name;
    private int noOfDays;

    public Rental(String name, int noOfDays)
    {
        this.name = name;
        this.noOfDays = noOfDays;
    }

    public String getName()
    {
        return name;
    }

    public int getNoOfDays()
    {
        return noOfDays;
    }

    protected int dailyRate()
    {
        return 500;
    }

    protected int discountPercent()
    {
        return 0;
    }
    
    public boolean isLongTerm()
    {
       return noOfDays >= 7;
    }

     public int total()
     {
        int amount = noOfDays * dailyRate();
        amount = amount - (amount * discountPercent()) / 100 ;
        return amount;  
     }

}