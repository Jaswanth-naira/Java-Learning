package app;
import rental.BikeRental;
import rental.CarRental;
import rental.Rental;

public class RentalApp 
{
    static int totalRevenue(Rental[] rentals)
    {
        int totalRevenue = 0;
        for(Rental rental: rentals)
        {
             totalRevenue += rental.total();
        }
        return totalRevenue;
    }

    static int countLongTerm(Rental[] rentals)
    {
        int noOfLongTermRentals = 0;
        for(Rental rental: rentals)
        {
            if(rental.isLongTerm()) noOfLongTermRentals++;
        }

        return noOfLongTermRentals;
    }
   
    static Rental findMostDays(Rental[] rentals)
    {
         if(rentals == null || rentals.length == 0) return null;
         Rental maxRental = null;
         for(Rental rental: rentals)
         {  
              if(rental != null)
              {
                  if(maxRental == null || rental.getNoOfDays() > maxRental.getNoOfDays())
                  {
                       maxRental = rental;
                  }
              } 
         }

         return maxRental;
    }
    
    public static void main(String[] args)
    {
        Rental[] rentals = {
                          new Rental("Asha",3),
                          new CarRental("Ravi",7,true),
                          new BikeRental("Meena",6),
                          new CarRental("John",2,false),
                          new BikeRental("Kiran",10)
        };

        for(Rental rental: rentals)
        {
            System.out.println(rental.getName() + " " + rental.total());
        }

        System.out.println(totalRevenue(rentals));
        System.out.println(countLongTerm(rentals));
        
        Rental mostDaysRental = findMostDays(rentals);
        if(mostDaysRental != null)
        {
            System.out.println(mostDaysRental.getName());
        }

        Rental[] emptyArray = new Rental[0];
        Rental emptyResult = findMostDays(emptyArray);
        System.out.println(emptyResult == null);
    }

}
