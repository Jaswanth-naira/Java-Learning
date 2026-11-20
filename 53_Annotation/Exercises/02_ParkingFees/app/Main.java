package app;
public class Main 
{
    public static void main(String[] args)
    {
        ParkingSpot carSpot = new ParkingSpot();
        ParkingSpot evSpot = new EvSpot();
        ParkingSpot bikeSpot = new BikeSpot();

        System.out.println("Car spot rate: " + carSpot.hourlyRate());
        System.out.println("Car spot fee for 3 hours: " + carSpot.fee(3));
        System.out.println("EV spot rate: " + evSpot.hourlyRate());
        System.out.println("EV spot fee for 3 hours: " + evSpot.fee(3));
        System.out.println("Bike spot rate: " + bikeSpot.hourlyRate());
        System.out.println("Bike spot fee for 3 hours: " + bikeSpot.fee(3));
        @SuppressWarnings("removal")
        int legacyRate = evSpot.rate();
        System.out.println("EV spot rate (old name): " + legacyRate);

    }
}