package app;

import store.Cart;
import store.Item;
import store.PerishableItem;

public class StoreApp {
    public static void main(String[] args) {
        
        Cart cart = new Cart(3);
    
        System.out.println(cart.add(new Item("PEN01", "Pen", 20)));
        System.out.println(cart.add(new Item("pen01", "Blue Pen", 25))); 
        System.out.println(cart.add(new PerishableItem("MLK07", "Milk", 50, 3)));
        System.out.println(cart.add(new Item("MLK07", "Milk Box", 60))); 
        System.out.println(cart.add(new Item("BK02", "Book", 120)));
        System.out.println(cart.add(null));

        System.out.println(cart);

        System.out.println(cart.getTotalPrice());

        System.out.println(cart.contains(new Item("Pen01", "Any", 0)));

        Item lowerCode = new Item("pen01", "A", 1);
        Item upperCode = new Item("PEN01", "B", 2);
        System.out.println(lowerCode.hashCode() == upperCode.hashCode());
    }
}