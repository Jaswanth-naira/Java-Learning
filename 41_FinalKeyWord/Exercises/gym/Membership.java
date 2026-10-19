package gym;
public class Membership 
{
    public static final int BASE_FEE = 1000;
    public static final int LONG_TERM_THRESHOLD = 12;
    public static final int DISCOUNT_PERCENT = 10;

    private final String name;
    private final int months;
    private final String cardCode;

    public Membership(String name, int months)
    {
        this.name = name;
        this.months = months;
        this.cardCode = buildCardCode(name,months);
    }

    private String buildCardCode(String name, int months)
    {
        String prefix = name.substring(0,3).toUpperCase();
        return prefix + "-" + months;
    }

    public String getName()
    {
        return name;
    }

    public int getMonths()
    {
        return months;
    }

    public String getCardCode()
    {
        return cardCode;
    }
   
   protected int getMonthlyFee()
   {
        return BASE_FEE;
   }

   public final int getTotal()
   {
        int subTotal = months * getMonthlyFee();
        if(months >= LONG_TERM_THRESHOLD) 
        {
            subTotal -= (subTotal * DISCOUNT_PERCENT) / 100;
        }

        return subTotal;

   }

}