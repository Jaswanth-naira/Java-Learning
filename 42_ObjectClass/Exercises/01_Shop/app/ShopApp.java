package app;
import shop.Product;
public class ShopApp 
{
    public static void main(String[] args)
    {
    Product first = new Product("Pen",20);
    Product second = new Product("Pen",20);

    Product alias = first;
    Product pricier = new Product("Pen",25);
    Object asObject = second;
    System.out.println(first);
    System.out.println("Item: " + pricier);
    System.out.println(first == second);
    System.out.println(first.equals(second));
    System.out.println(first == alias);
    System.out.println(first.equals(pricier));
    System.out.println(first.hashCode() == second.hashCode());
    System.out.println(first.equals(null));
    System.out.println(first.equals(asObject));
    System.out.println(asObject);
    }
}