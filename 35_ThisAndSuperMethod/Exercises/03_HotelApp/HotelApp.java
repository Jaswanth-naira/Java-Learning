class Room
{
     private int number;
     private int nightlyRate;
     private static int roomsBuilt;

     Room(int number, int nightlyRate)
     {
         this.number = number;   

         this.nightlyRate = (nightlyRate < 1000) ? 1000 : nightlyRate;
         roomsBuilt++;
     }

     Room(int number) 
     {
        this(number, 1000);
     }

     int getNumber()
     {
        return number;
     }

     int getNightlyRate()
     {
        return nightlyRate;
     }

     static int getRoomsBuilt()
     {
        return roomsBuilt;
     }
}
class DeluxeRoom extends Room 
{
    private boolean balcony;

    DeluxeRoom(int number, int nightlyRate, boolean balcony)
    {
         super(number,nightlyRate);  
         this.balcony = balcony; 
    }

    DeluxeRoom(int number)
    {
        this(number, 2500, true);
    }

    DeluxeRoom(Room base, boolean balcony)
    {
        super(base.getNumber(), base.getNightlyRate() + 1500);
        this.balcony = balcony;
    } 

    boolean hasBalcony()
    {
        return balcony;
    }
}

class Suite extends DeluxeRoom
{
    private int butlerHours;

    Suite(int number, int butlerHours)
    {
        super(number,6000,true);
        this.butlerHours = (butlerHours < 0) ? 0 : butlerHours;
    }

    int getButlerHours()
    {
        return butlerHours;
    }
}

class HotelTools 
{
    static Room mostExpensive(Room[] rooms)
    {
      if(rooms == null) return null;

      Room mostExpensiveRoom = null;

      for(Room room: rooms)
      {
        if(room == null) continue;
        if(mostExpensiveRoom == null || room.getNightlyRate() > mostExpensiveRoom.getNightlyRate())
        {
            mostExpensiveRoom = room;
        }
      } 
      return mostExpensiveRoom;
    }

    static int totalNightly(Room[] rooms)
    {
        if(rooms == null) return 0;
        int totalNightlyRates = 0;
        for(Room hotelRoom: rooms)
        {
            if(hotelRoom == null) continue;
            totalNightlyRates += hotelRoom.getNightlyRate();
        }
        return totalNightlyRates;
    }
}
class HotelApp
{
    public static void main(String[] args)
    {
       Room r101 = new Room(101, 800);
       Room r102 = new Room(102);
       DeluxeRoom d201 = new DeluxeRoom(201);
       Suite s301 = new Suite(301, -2);

       System.out.println("Room 101 rate: " + r101.getNightlyRate()); 
       System.out.println("Room 102 rate: " + r102.getNightlyRate());  
       System.out.println("Room 201 rate: " + d201.getNightlyRate() + ", balcony: " + d201.hasBalcony()); 
       System.out.println("Room 301 rate: " + s301.getNightlyRate() + ", butler hours: " + s301.getButlerHours());  
       System.out.println("Rooms built: " + Room.getRoomsBuilt());  

       DeluxeRoom upgraded = new DeluxeRoom(r101, false);
       System.out.println("Upgraded 101 rate: " + upgraded.getNightlyRate() + ", balcony: " + upgraded.hasBalcony());  
       System.out.println("Original 101 rate: " + r101.getNightlyRate());
       System.out.println("Same object: " + (upgraded == r101));
       System.out.println("Rooms built: " + Room.getRoomsBuilt());

       Room[] floor = {r101, upgraded, d201, s301, null};
       Room best = HotelTools.mostExpensive(floor);
       if(best != null) System.out.println("Most expensive: Room " + best.getNumber());
       System.out.println("Total nightly: " + HotelTools.totalNightly(floor));
       Room emptyFloorResult = HotelTools.mostExpensive(new Room[0]);
       System.out.println("Empty floor returns null: " + (emptyFloorResult == null));
       System.out.println("Null floor returns null: " + (HotelTools.mostExpensive(null) == null));
    }
}