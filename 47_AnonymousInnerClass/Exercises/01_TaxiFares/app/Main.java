package app;
import transport.Fare;
public class Main 
{
    public static void main(String[] args)
    {
        Fare regular = new Fare();
        System.out.println("Regular: " + regular.fareFor(5));

        Fare nightFare = new Fare(){
            @Override
            protected int ratePerKm(){
                return super.ratePerKm() * 2;
            }
        };

        System.out.println("Night: " + nightFare.fareFor(5));

        Fare studentFare = new Fare(){
            @Override 
            public int fareFor(int km){
                return super.fareFor(km) / 2;
            }
        };
        System.out.println("Student: " + studentFare.fareFor(5));

        int festivalBase = 0;
        Fare festivalFare  = new Fare(){
            @Override 
            protected int baseFare()
            {
                return festivalBase;
            }
        };
        System.out.println("Festival: " + festivalFare.fareFor(5));

        System.out.println("Promo: " + new Fare() {
            @Override
            protected int ratePerKm() {
                return 5;
            }
        }.fareFor(5));

    }
}