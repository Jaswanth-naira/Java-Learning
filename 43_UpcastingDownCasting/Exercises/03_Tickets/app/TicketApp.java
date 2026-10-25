package app;

import tickets.Ticket;
import tickets.ConcertTicket;
import tickets.MovieTicket;

public class TicketApp 
{
     private static int totalPrice(Ticket[] tickets)
     {
        int total = 0;
        if (tickets == null)
        {
            return total;
        }

        for(Ticket ticket: tickets)
        {
            if(ticket != null)
            {
                total += ticket.getPrice();
            }
        }
        return total;
     }

     private static int countFrontRowConcertTickets(Ticket[] tickets)
     {
        int count = 0;
        if (tickets == null)
        {
            return count;
        }

        for(Ticket ticket : tickets){
            if(ticket instanceof ConcertTicket ct)
            {
                if (ct.isFrontRow())
                {
                    count++;
                }
            }
        }
        return count;
     }

   private static MovieTicket firstComboMovieTicket(Ticket[] tickets) 
   {
        if(tickets == null)
        {
            return null;
        }

        for(Ticket ticket: tickets)
        {
            if(ticket instanceof MovieTicket mt)
            {
                if(mt.hasCombo())
                {
                    return mt;
                }
            }
        }
        return null;       
    }       
    private static int serviceFee(Ticket t)
    {
        return 20;
    }

    private static int serviceFee(ConcertTicket ct)
    {
        return 50;
    }

    private static int totalServiceFees(Ticket[] tickets)
    {
        int total = 0;
        if(tickets == null)
        {
            return total;
        }

        for(Ticket ticket: tickets)
        {
            if(ticket != null)
            {
                if(ticket instanceof ConcertTicket ct)
                {
                    total += serviceFee(ct);
                }
                else 
                {
                    total += serviceFee(ticket);
                }
            }
        }
       return total;
    }

    public static void main(String[] args)
    {
        Ticket[] tickets = new Ticket[] {
                           new MovieTicket("M1",200,false),
                           new ConcertTicket("C1",1000,2),
                           null,
                           new MovieTicket("M2",250,true),
                           new ConcertTicket("C2",800,7),
                           new Ticket("G1",100)
        };

        for(Ticket t : tickets)
        {
            if(t != null)
            {
                System.out.println(t.getId() + " " + t.getPrice());
            }
        }

        System.out.println(totalPrice(tickets));
        System.out.println(countFrontRowConcertTickets(tickets));
        MovieTicket firstCombo = firstComboMovieTicket(tickets);
        if(firstCombo != null)
        {
            System.out.println(firstCombo.getId() + " " + firstCombo.getPrice());
        }

        System.out.println(totalServiceFees(tickets));

        Ticket asTicket = tickets[1];
        System.out.println(serviceFee(asTicket));

        System.out.println(serviceFee((ConcertTicket) asTicket));

        System.out.println(firstComboMovieTicket(new Ticket[] { tickets[0]}) == null);
    }

}