class Ticket 
{
   private int basePrice;

   Ticket(int basePrice)
   {
       this.basePrice = basePrice < 100 ? 100 : basePrice;
   }

   int price()
   {
      return basePrice;
   }

   String label()
   {
      return "Standard";
   }
}
class StudentTicket extends Ticket
{
   StudentTicket(int basePrice)
   {
        super(basePrice);
   }

   @Override
   int price()
   {
      return super.price() * 80/100;
   }

   @Override
   String label()
   {
      return "Student";
   }
}

class ReclinerTicket extends Ticket 
{
     ReclinerTicket(int basePrice)
     {
        super(basePrice);
     }

     @Override 
     int price()
     {
         return super.price() + 150;
     }

     @Override 
     String label()
     {
         return "Recliner";
     }
}

class BoxOffice 
{
    static int totalSales(Ticket[] tickets)
    {
        if(tickets == null) return 0;
        int priceOfAllTickets = 0;
        for(Ticket ticket: tickets)
        {
              if(ticket == null) continue;
              priceOfAllTickets += ticket.price();
        }
        return priceOfAllTickets;
    }
}

class CinemaApp 
{
    public static void main(String[] args)
    {
        Ticket standard = new Ticket(200);
        StudentTicket student = new StudentTicket(200);
        Ticket cheap = new Ticket(50);

        System.out.println(standard.label() + ": " + standard.price());
        System.out.println(student.label() + ": " + student.price());
        System.out.println("Cheap ticket: " + cheap.price());

        ReclinerTicket recliner = new ReclinerTicket(200);
        System.out.println(recliner.label() + ": " + recliner.price());
        Ticket viaParent = student;
        System.out.println("Through Ticket reference: " + viaParent.label() + ", " + viaParent.price());
        Ticket[] sales = {standard, student, recliner, null};
        System.out.println("Total sales: " + BoxOffice.totalSales(sales));
    }
}