package food; 
public class Restaurant 
{
    private final String  restaurantName;
    private final int serviceChargePercent;

    public Restaurant(String restaurantName, int serviceChargePercent)
    {
        this.restaurantName = restaurantName;
        this.serviceChargePercent = serviceChargePercent;
    }

    public String getRestaurantName()
    {
        return restaurantName;
    } 

    public class Bill 
    {
        private final int amount;

        public Bill(int amount)
        {
            this.amount = amount;
        }

        public int totalWithService()
        {
            return amount + (amount * serviceChargePercent)/100;
        }
    }

    public static class Dish 
    {
        private final String dishName;
        private final int price;

        public Dish(String dishName, int price)
        {
            this.dishName = dishName;
            this.price = price;
        }
        
        public String getDishName()
        {
            return dishName;
        }

        public int getPrice()
        {
            return price;
        }

    }
}