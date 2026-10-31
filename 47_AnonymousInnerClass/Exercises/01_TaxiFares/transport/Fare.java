package transport;
public class Fare
{
     private static final int BASE_FARE = 20;
     private static final int RATE_PER_KM = 8;
     
     protected int baseFare()
     {
        return BASE_FARE;
     }    

     protected int ratePerKm()
     {
        return RATE_PER_KM;
     }

     public int fareFor(int km)
     {
        return baseFare() + ratePerKm() * km;
     }
}