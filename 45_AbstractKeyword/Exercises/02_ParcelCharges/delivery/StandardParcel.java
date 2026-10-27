package delivery;

public class StandardParcel extends Parcel 
{
    private static final int BASE_CHARGE = 40;
    private static final int RATE_PER_KG = 10;

    public StandardParcel(String trackingId, int weightKg)
    {
        super(trackingId, weightKg);
    }

    @Override
    public int baseCharge()
    {
        return BASE_CHARGE;
    }
    
    
    @Override 
    public int ratePerKg()
    {
     return RATE_PER_KG;
    }
    
    
}