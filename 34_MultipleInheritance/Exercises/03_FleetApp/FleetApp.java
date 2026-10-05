class Vehicle 
{
   private int kmDriven = 0;

   boolean ride(int km)
   {
      if(km <= 0) return false;
      this.kmDriven += km;
      return true;
   }

   int getKmDriven()
   {
      return kmDriven;
   }
}
class Bike extends Vehicle 
{
     private int gear = 1;
     boolean shiftGear(int gear)
     {
        if(gear < 1 || gear > 7) return false;
        this.gear = gear;
        return true; 
     }

     int getGear()
     {
        return gear;
     }
}
class ElectricBike extends Bike 
{
     private Battery battery;

     ElectricBike(Battery battery)
     {
        this.battery = battery;
     }  

     boolean rideOnBattery(int km)
     {
         if(km <= 0) return false;
         
         int cost = km * 2;
         if(cost > battery.getCharge()) return false;

         battery.drain(cost);
         ride(km);
         return true;
     } 

     int getBatteryCharge()
     {
         return battery.getCharge();
     }
     
   
     boolean swapBattery(ElectricBike other)
     {
        if(other == null || other == this) return false;
        Battery temp = this.battery;
        this.battery = other.battery;
        other.battery = temp;
        return true;
     }
}
class Battery 
{
   private int charge;
   Battery(int charge)
   {
      this.charge = charge;
   }

   boolean drain(int amount)
   {
       if(amount <= 0 || amount > charge) return false;
       this.charge -= amount;
       return true;
   }

   int getCharge()
   {
     return charge; 
   }
} 
class FleetTools 
{
   static int totalKm(Vehicle[] fleet)
   {
      if(fleet == null ) return 0;
      int totalKmsDriven = 0;
      for(Vehicle vehicle: fleet)
      {
          if(vehicle == null) continue;
         totalKmsDriven += vehicle.getKmDriven();
      }
      return totalKmsDriven;
   }

   static int pedalAll(Vehicle[] fleet, int km)
   {
      if(fleet == null || km <= 0) return 0;
      int totalVehiclesRode = 0;
      for(Vehicle Vehicles: fleet)
      {
          if(Vehicles == null) continue;
          if(Vehicles.ride(km)) totalVehiclesRode++;
      }
     return totalVehiclesRode;
   }
}
class FleetApp
{
    public static void main(String[] args)
    {
       Battery battery1 = new Battery(60);
       Battery battery2 = new Battery(100);

       ElectricBike bikeA = new ElectricBike(battery1);
       ElectricBike bikeB = new ElectricBike(battery2);

       System.out.println("Gear 3: " + bikeA.shiftGear(3));
       System.out.println("Battery ride 20 km: " + bikeA.rideOnBattery(20));
       System.out.println("Battery ride 15 km: " + bikeA.rideOnBattery(15));
       System.out.println("Pedal 5 km: " + bikeA.ride(5)); 
       System.out.println("Bike A km: " + bikeA.getKmDriven());
       System.out.println("Bike A gear: " + bikeA.getGear());
       System.out.println("Bike A charge: " + bikeA.getBatteryCharge());

      System.out.println("Swap: " + bikeA.swapBattery(bikeB));
      System.out.println("Bike A charge: " + bikeA.getBatteryCharge());
      System.out.println("Bike B charge: " + bikeB.getBatteryCharge());
      System.out.println("Battery 1 charge: " + battery1.getCharge()); 
      System.out.println("Bike B battery ride 15 km: " + bikeB.rideOnBattery(15));
      System.out.println("Bike A battery ride 15 km: " + bikeA.rideOnBattery(15));
      System.out.println("Bike A charge: " + bikeA.getBatteryCharge());
      System.out.println("Bike A km: " + bikeA.getKmDriven());
      System.out.println("Swap with itself: " + bikeA.swapBattery(bikeA));
      System.out.println("Swap with null: " + bikeA.swapBattery(null));

      Vehicle[] fleet = {bikeA, bikeB, new Bike(), null};
      System.out.println("Fleet km: " + FleetTools.totalKm(fleet));
      System.out.println("Vehicles pedalled: " + FleetTools.pedalAll(fleet,10));
      System.out.println("Fleet km: " + FleetTools.totalKm(fleet));
      System.out.println("Bike A charge after pedalling: " + bikeA.getBatteryCharge());
      System.out.println("Pedal 0 km: " + FleetTools.pedalAll(fleet,0));
      System.out.println("Null fleet: " + FleetTools.pedalAll(null,5));
    }

}