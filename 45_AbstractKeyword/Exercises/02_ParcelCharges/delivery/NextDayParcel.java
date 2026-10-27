package delivery;
public class NextDayParcel extends ExpressParcel
{
    private static final int RATE_PER_KG = 20;

    public NextDayParcel(String trackingId, int weightKg)
    {
        super(trackingId,weightKg);
    }

    @Override 
    public int ratePerKg()
    {
        return RATE_PER_KG;
    }
}