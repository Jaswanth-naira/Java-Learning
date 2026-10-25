package tickets;
public class MovieTicket extends Ticket
{
     private final boolean hasCombo;

     public MovieTicket(String id, int basePrice, boolean hasCombo)
     {
        super(id,basePrice);
        this.hasCombo = hasCombo;
     }
     
     public boolean hasCombo()
     {
        return hasCombo;
     }
     
     @Override 
     public int getPrice()
     {
        return getBasePrice() + (hasCombo ? 150 : 0);
     }

}