import java.util.*;
class Book
{
        int id;
        String title;
        double price;
        
        
        void acceptDetails(Scanner sc)
        {
            System.out.print("Enter book id: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter book title: ");
            title = sc.nextLine();

            System.out.print("Enter book price: ");
            price = sc.nextDouble();
        }

        double findAverage(Book[] arr)
        {
            double sum = 0;
            for(int i = 0; i < arr.length; i++)
            {
                sum += arr[i].price;
            }
            return (arr.length>0) ? (sum/arr.length) : 0;
        }

        void findCostlyBooks(Book[] arr)
        {
             double average = findAverage(arr);
             System.out.println("\nAverage Price: "+average);
             System.out.println("Books priced above average: ");

             for(int i=0;i<arr.length;i++)
             {
                 if(arr[i].price > average)
                 {
                    arr[i].displayBookDetails();
                 }
             }
        }

         void displayBookDetails()
        {

            System.out.println("Book id: " + id + ", Book title: "+ title + ", Book price: " + price);
        }
       
}
class BookDetails
{   
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of an array: ");
         int size = sc.nextInt();
         Book[] arr = new Book[size];

         for(int i=0;i<arr.length;i++)
         {
             arr[i] = new Book();
             arr[i].acceptDetails(sc);
         }

         if( size > 0)
         {
            Book obj = new Book();
            obj.findCostlyBooks(arr);
         }
         
    }
}