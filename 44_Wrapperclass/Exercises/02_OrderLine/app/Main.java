package app;

import shop.OrderLine;

public class Main
{
    public static void main(String[] args)
    {
        OrderLine first = new OrderLine("1042", "200", "2.5", "TRUE");
        OrderLine second = new OrderLine("10A2", "200", "4.25", "yes");
        OrderLine third = new OrderLine("7781", "15", "10", "true");

        System.out.println("First code valid: " + first.isValidCode());
        System.out.println("Second code valid: " + second.isValidCode());
        System.out.println("First total: " + first.lineTotal());
        System.out.println("Second total: " + second.lineTotal());
        System.out.println("Third total: " + third.lineTotal());
        System.out.println("Same quantity (first, second): " + first.sameQuantity(second));
        System.out.println("Same quantity (first, third): " + first.sameQuantity(third));
        System.out.println("First in stock: " + first.isInStock());
        System.out.println("Second in stock: " + second.isInStock());
    }
}