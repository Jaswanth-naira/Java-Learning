package delivery;
public abstract class Parcel 
{
    private final String trackingId;
    private final int weightKg;

    public Parcel(String trackingId, int weightKg)
    {
        this.trackingId = trackingId;
        this.weightKg = weightKg;
    }

    public String getTrackingId()
    {
        return trackingId;
    }

    public abstract int baseCharge();

    public abstract int ratePerKg();

    public final int totalCharge()
    {
        return baseCharge() + ratePerKg() * weightKg;
    }

}