class MovieTicket 
{
    private String movieName;
    private int seatNumber;

    MovieTicket()
    {
        this("Unassigned",0);
        this.seatNumber = 1;
    }
    
    MovieTicket(String movieName, int seatNumber)
    {
         this.movieName = movieName;
         this.seatNumber = seatNumber;
    }
    
    String getName()
    {
        return movieName;
    }

    int getSeatNumber()
    {
        return seatNumber;
    }

}

class MovieTicketApp 
{
    public static void main(String [] args)
    {
        MovieTicket first = new MovieTicket();
          MovieTicket second = new MovieTicket("Unassigned", 0);
          
          MovieTicket saved = first;
          
          MovieTicket third = new MovieTicket(
              "Java Adventure",
              first.getSeatNumber() + 11
          );
          
          first = second;
          
          MovieTicket fourth = new MovieTicket();
          
          System.out.println(first == second);
          System.out.println(saved == first);
          System.out.println(saved == fourth);
          System.out.println(saved.getSeatNumber() == fourth.getSeatNumber());
          
          System.out.println("First: " + first.getName()
              + ", " + first.getSeatNumber());
          
          System.out.println("Saved: " + saved.getName()
              + ", " + saved.getSeatNumber());
          
          System.out.println("Third: " + third.getName()
              + ", " + third.getSeatNumber());
          
          System.out.println("Fourth: " + fourth.getName()
              + ", " + fourth.getSeatNumber());
                  
        
        
        
        /*
        MovieTicket firstTicket = new MovieTicket();
        MovieTicket secondTicket = new MovieTicket("Java Adventure",12);

        System.out.println("Ticket 1: " + firstTicket.getName() + ", " + "seat " + firstTicket.getSeatNumber());
        System.out.println("Ticket 2: " + secondTicket.getName() + ", " + "seat " + secondTicket.getSeatNumber());
        */
    }
}