import java.util.*;
class Product 
{
     private String name;
     private double price;

     boolean setName(String productName)
     {
         if(productName == null || productName.trim().isEmpty())  return false;
         name = productName;
         return true;

     }

     boolean setPrice(double productPrice)
     {
         if(productPrice <= 0) return false;
         price = productPrice;
         return true;
     }

     String getName()
     {
         return name;
     }

     double getPrice()
     {
        return price;
     }

     
}


class ProductDetails
{
    public static void main(String args[])
    {
    
         Scanner sc = new Scanner(System.in);
         Product product = new Product();
         
         System.out.print("Enter a product name: ");
         
         String name = sc.nextLine();
         
         if( !product.setName(name)){
             System.out.print("Invalid Input! Product name cannot be blank. ");
             sc.close();
             return;
         }
     
         
         System.out.print("Enter product price: ");
     
         if( !sc.hasNextDouble()){
             System.out.print("Invalid Input! Please enter a numerical price.");
             sc.close();
             return;
         }
         
         double price = sc.nextDouble();
         product.setName("Laptop");
         if( !product.setPrice(price)){
             System.out.print("Invalid Input! Product price must be greater than 0.");
             sc.close();
             return;
         }
        
     
         System.out.println("\n-------Displaying Product Details-------");
         System.out.println("Product name is: " + product.getName());
         System.out.printf("Product price is: $%.2f%n", product.getPrice());
         sc.close();
            
    }
     
}     