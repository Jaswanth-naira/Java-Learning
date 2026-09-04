import java.util.Scanner;

class Book 
{
    private String title;
    private int pageCount;

    boolean setTitle(String bookTitle)
    {
        if(bookTitle == null || bookTitle.trim().isEmpty()) return false;
        title = bookTitle.trim();
        return true;
    }

    boolean setPageCount(int bookPageCount)
    {
         if(bookPageCount <= 0) return false;
         pageCount = bookPageCount;
         return true;
    }

    String getTitle()
    {
        return title;
    }

    int getPageCount()
    {
        return pageCount;
    }
}
class BookDetails 
{
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
         Book book = new Book();

         System.out.print("Enter book's title: ");

         
         String bookTitle = scanner.nextLine();

         if(!book.setTitle(bookTitle)){
            System.out.print("Book Title cannot be blank.");
            scanner.close();
            return;
         }

         System.out.print("Enter book's pagecount: ");

         if(!scanner.hasNextInt()){
            System.out.print("Invalid Input! Please enter a valid number.");
            scanner.close();
            return;
         }

         int bookPageCount = scanner.nextInt();
         if(!book.setPageCount(bookPageCount)){
            System.out.println("Please enter number greater than 0.");
            scanner.close();
            return;
         }
         
         System.out.println("\n----DISPALYING BOOK DETAILS-----");
         System.out.println("Title: " + book.getTitle());
         System.out.println("PageCount: " + book.getPageCount());
         


         scanner.close();

    }
}