import java.util.*;
class Product
{
       int id;
       String name;
       int quantity;
       int price;

    
       void acceptDetails(Scanner sc)
       {
            System.out.print("Enter id: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            name = sc.nextLine();

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            System.out.print("Enter price: ");
            price = sc.nextInt();
       }

       void printProductCost(Product[] arr)
       {
            int grandTotal  = 0;
            System.out.println("\n----Printing each product's total cost------");
            for(int i=0;i<arr.length;i++)
            {
                int cost = arr[i].quantity * arr[i].price;
                System.out.println("The total cost of " + arr[i].name  + " Product is  : "+cost);
                grandTotal += cost;
            }
            printTotalProductCost(grandTotal);
       }

       void printTotalProductCost(int totalProductCost)
       {
         System.out.println("\nThe grand total of all products: "+totalProductCost);
       }
      

}
class PriceOfProduct 
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        Product[] arr = new Product[size];
        for(int i=0;i<arr.length;i++)
        {
             arr[i] = new Product();
             arr[i].acceptDetails(sc);
        }
        Product obj = new Product();
        obj.printProductCost(arr);

     }
}