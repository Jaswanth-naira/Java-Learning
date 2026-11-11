package app;
public class Bus extends Vehicle implements PassengerCarrier 
{
    private final int seats;
    private final int ratePerKm;
    public Bus(String registration, int seats, int ratePerKm)
    {
        super(registration);
        this.seats = seats;
        this.ratePerKm = ratePerKm;
    }

    @Override
    public int seats()
    {
        return seats;
    }
    
    @Override
    public int ratePerKm()
    {
        return ratePerKm;
    }
}