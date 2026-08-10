import java.util.*;
class Ticket 
{
     
     int ticketNo;
     String passengerName;
     boolean isBooked;
      

     void displayBookedTickets(Ticket[] arr)
     {
            System.out.println();
            System.out.println("BELOW ARE BOOKED TICKETS");
            boolean anyBooked = false;
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i].isBooked)
                {
                     System.out.println("SEAT NO " + (i + 1) + " ALREADY BEEN BOOKED");
                     anyBooked = true;
                }
            }
                if(!anyBooked)
                {
                     System.out.println("No seats are booked yet.");
                }
            
     }     
    void displayAvailableTickets(Ticket[] arr)
    {
        System.out.println("BELOW ARE AVAILABLE TICKETS");
        for(int i = 0; i < arr.length; i++)
        {
            if(!arr[i].isBooked)
            {
                 System.out.println("SEAT NO " + (i + 1) + " IS AVAILABLE");
            }
        }
        System.out.println();
    }  
    
    void bookATicket(Ticket[] arr,Scanner sc)
    {
        int chosenSeat = 0;
        
        while (true) {
            System.out.print("Enter the seat number you want to choose (1-5): ");
            chosenSeat = sc.nextInt();
            sc.nextLine(); 


            if (chosenSeat < 1 || chosenSeat > 5)
             {
                System.out.println("Invalid seat number! Please choose between 1 and 5.");
                continue;
             }

            if (arr[chosenSeat - 1].isBooked)
            {
                System.out.println("SORRY SEAT HAS ALREADY BEEN BOOKED. PLEASE CHOOSE ANOTHER.");
            }
            else
             {
                break;
             }
        }  

    
    
        System.out.print("Please enter passenger name here: ");
        passengerName = sc.nextLine();

        arr[chosenSeat - 1].ticketNo = chosenSeat;
        arr[chosenSeat - 1].passengerName = passengerName;
        arr[chosenSeat - 1].isBooked = true;

        System.out.println("-----------------------------------");
        System.out.println("------PRINTING TICKET DETAILS------");
        System.out.println("TICKET NO : " + chosenSeat);
        System.out.println("PASSENGER NAME : " + passengerName);
        System.out.println("Hi " + passengerName + " Your booking with ticketno " + chosenSeat + " is Success");
        System.out.println("----------------------------------");
     }
}


class TicketDetails 
{
     public static void main(String args[])
     {
         Ticket[] arr = new Ticket[5];
         for(int i = 0; i < arr.length; i++)
         {
               arr[i] = new Ticket();
         }
     
        System.out.println("WELCOME TO THE ONLINE TICKET BOOKING: ");
        Ticket obj = new Ticket();
   
        Scanner sc = new Scanner(System.in);
        char choice;

         do {
             obj.displayBookedTickets(arr);
             obj.displayAvailableTickets(arr);
             obj.bookATicket(arr,sc);

             System.out.print("\nDo you want to book another ticket? (y/n): ");
             choice = sc.next().charAt(0);
             
         } while (choice == 'y' || choice == 'Y');

         System.out.println("\nThank you for using the Ticket Booking System!");
         
     }
}