package delivery;
public class SameDayParcel extends ExpressParcel
{
    private static final int RATE_PER_KG = 30;

    public SameDayParcel(String trackingId, int weightKg)
    {
        super(trackingId,weightKg);
    }

    @Override 
    public int ratePerKg()
    {
        return RATE_PER_KG;
    }
}