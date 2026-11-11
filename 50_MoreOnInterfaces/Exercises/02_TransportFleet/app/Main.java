package app;
public class Main 
{
    public static void main(String[] args)
    {
       Bus bus = new Bus("BUS-101",40,30);
       System.out.println("Bus registration: " + bus.getRegistration());
       System.out.println("Bus seats: " + bus.seats());
       System.out.println("Bus rate per km: " + bus.ratePerKm());

       Truck truck = new Truck("TRK-201", 8000, 45);
       System.out.println("Truck registration: " + truck.getRegistration());
       System.out.println("Truck max load kg: " + truck.maxLoadKg());
       System.out.println("Truck rate per km: " + truck.ratePerKm()); 

       Van van = new Van("VAN-301", 8, 1200, 20);
       PassengerCarrier vanAsPassenger = van;
       CargoCarrier vanAsCargo = van;

       System.out.println("Van seats: " + vanAsPassenger.seats());
       System.out.println("Van max load kg: " + vanAsCargo.maxLoadKg());
       System.out.println("Van rate as passenger carrier: " + vanAsPassenger.ratePerKm());
       System.out.println("Van rate as cargo carrier: " + vanAsCargo.ratePerKm());

       PassengerCarrier[] passengerCarriers = {bus, van};
       CargoCarrier[] cargoCarriers = {truck, van};
       Fleet fleet = new Fleet(passengerCarriers, cargoCarriers);
       System.out.println("Total seats: " + fleet.totalSeats());
       System.out.println("Total load kg: " + fleet.totalLoadKg());
       

       int[] loads = { 1000, 1200, 5000, 9000};

       for(int load: loads)
       {
          CargoCarrier carrier = fleet.cheapestCargoFor(load);
          String registration = (carrier != null) ? carrier.getRegistration() : "none";
          System.out.println("Cheapest for " + load + " kg: " + registration);
       }
    }
}