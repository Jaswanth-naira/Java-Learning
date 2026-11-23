package app;
public class Main 
{
    public static void main(String[] args)
    {
        MenuItem paneerWrap = new PaneerWrap();
        MenuItem chickenBurger = new ChickenBurger();

        System.out.println(paneerWrap.name() + ": " + paneerWrap.price());
        System.out.println(chickenBurger.name() + ": " + chickenBurger.price());

        Kitchen kitchen = new Kitchen();
        System.out.println("Paneer wrap vegetarian: " + kitchen.isVegetarian(paneerWrap));
        System.out.println("Chicken burger vegetarian: " + kitchen.isVegetarian(chickenBurger));

        DeliveryFee deliveryFee = new PerKmFee();
        System.out.println("Delivery fee for 3 km: " + deliveryFee.fee(3));
        System.out.println("Paneer wrap total for 3 km: " + (paneerWrap.price() + deliveryFee.fee(3)));
    }
}