package app;
import food.Restaurant;

public class Main 
{
   public static void main(String[] args)
   {
        Restaurant spiceHub = new Restaurant("Spice Hub",10);
        Restaurant greenLeaf = new Restaurant("Green Leaf",5);

        Restaurant.Bill spiceBill = spiceHub.new Bill(1200);
        Restaurant.Bill leafBill =  greenLeaf.new Bill(1200);

        System.out.println(spiceHub.getRestaurantName() + " bill: " + spiceBill.totalWithService());
        System.out.println(greenLeaf.getRestaurantName() + " bill: " + leafBill.totalWithService());

        Restaurant.Dish dish = new Restaurant.Dish("Paneer Tikka",280);
        System.out.println(dish.getDishName() + ": " + dish.getPrice());

   }
}