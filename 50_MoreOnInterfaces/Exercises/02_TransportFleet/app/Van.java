package app;
public class Van extends Vehicle implements PassengerCarrier,CargoCarrier 
{
     private final int seats;
     private final int maxLoadKg;
     private final int ratePerKm;

     public Van(String registration, int seats, int maxLoadKg, int ratePerKm)
     {
           super(registration);
           this.seats = seats;
           this.maxLoadKg = maxLoadKg;
           this.ratePerKm = ratePerKm;
     }

     @Override
     public int seats()
     {
        return seats;
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