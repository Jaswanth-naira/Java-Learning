package app;
public class Truck extends Vehicle implements CargoCarrier
{
    private final int maxLoadKg;
    private final int ratePerKm;
    public Truck(String registration, int maxLoadKg, int ratePerKm)
    {
        super(registration);
        this.maxLoadKg = maxLoadKg;
        this.ratePerKm = ratePerKm;
    }
    
    @Override
    public int maxLoadKg()
    {
        return maxLoadKg;
    }

    @Override
    public int ratePerKm()
    {
        return ratePerKm;
    }

}