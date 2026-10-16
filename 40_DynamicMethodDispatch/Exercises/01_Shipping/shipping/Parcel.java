package shipping;

public class Parcel 
{
   private int weight;

   public Parcel(int weight)
   {
      this.weight = weight;
   }

   public int getWeight()
   {
       return weight;
   }

   protected int ratePerKg()
   {
       return 20;
   }

   public int cost()
   {
       return getWeight() * ratePerKg();
   }

}