package shipping;

public class ExpressParcel extends Parcel
{
    public ExpressParcel(int weight)
    {
        super(weight);
    }  

    @Override 
    protected int ratePerKg()
    {
        return 35;
    }
}