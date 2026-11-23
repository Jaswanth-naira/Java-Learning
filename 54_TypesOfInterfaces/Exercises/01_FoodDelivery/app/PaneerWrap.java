package app;
public class PaneerWrap implements Vegetarian,MenuItem
{
      private static final int PRICE = 180; 
      
      @Override
      public String name()
      {
           return "Paneer wrap";
      }
      
      @Override
      public int price()
      {
          return PRICE;
      }
}