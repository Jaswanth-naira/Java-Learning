package app;
public class Main 
{
    public static void main(String[] args)
    {
         Ticket regularTicket = new RegularTicket("F7");
         Ticket reclinerTicket = new ReclinerTicket("R2");
         Ticket comboTicket = new ComboTicket("R3");
         BoxOffice boxOffice = new BoxOffice();

         Ticket[] tickets = {regularTicket, reclinerTicket, comboTicket};

         for(Ticket ticket: tickets)
         {
            System.out.println(ticket.seat() + " price: " + ticket.price());
            System.out.println(ticket.seat() + " refund: " + boxOffice.refundFor(ticket));
         }

         Pricing counterPricing = new CounterPricing();
         OnlinePricing appPricing = new AppPricing();

         for(Ticket ticket: tickets)
         {
            System.out.println(ticket.seat() + " counter price: " + counterPricing.finalPrice(ticket));
            System.out.println(ticket.seat() + " app price: " + appPricing.finalPrice(ticket));
         }

         System.out.println("App convenience fee: " + appPricing.convenienceFee());
    }
}