package app;
public class Fleet 
{
    private final PassengerCarrier[] passengerCarriers;
    private final CargoCarrier[] cargoCarriers;
    
    public Fleet(PassengerCarrier[] passengerCarriers, CargoCarrier[] cargoCarriers)
    {
          this.passengerCarriers = passengerCarriers;
          this.cargoCarriers = cargoCarriers;
    }

    public int totalSeats()
    {
        int total = 0;
        for(PassengerCarrier carrier: passengerCarriers)
        {
            total +=  carrier.seats();
        }
        return total;
    }

    public int totalLoadKg()
    {
        int totalKg = 0;
        for(CargoCarrier carrier: cargoCarriers)
        {
            totalKg += carrier.maxLoadKg();
        }
        return totalKg;
    }

    public CargoCarrier cheapestCargoFor(int loadKg)
    {
        CargoCarrier cheapest = null;

        for(CargoCarrier carrier: cargoCarriers)
        {
            if(carrier.maxLoadKg() >= loadKg)
            {
                if(cheapest == null || carrier.ratePerKm() < cheapest.ratePerKm())
                {
                    cheapest = carrier;
                }
            }
        }

        return cheapest;
    }
}