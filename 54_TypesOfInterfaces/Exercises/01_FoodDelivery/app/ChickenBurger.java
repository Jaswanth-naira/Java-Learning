package app;
public class ChickenBurger implements MenuItem
{
     private static final int PRICE = 220;
     
     @Override 
     public String name() 
     {
        return "Chicken burger";
     }

     @Override 
     public int price()
     {
        return PRICE;
     }

}