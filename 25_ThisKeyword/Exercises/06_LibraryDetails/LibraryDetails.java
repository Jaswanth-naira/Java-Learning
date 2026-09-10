import java.util.Scanner;
class Student
{
   private String name;
   
   boolean setName(String name)
   {
      if(name == null || name.trim().isEmpty()) return false;
      this.name = name.trim();
      return true;
   }

   String getName()
   {
      return name;
   }

   boolean borrowBook(LibraryBook book)
   {
        if(book == null) return false;

        return book.borrowBy(this);       
    
   }

}

class LibraryBook 
{
   private String title;
   private Student borrower;

   boolean setTitle(String title)
   {
       if(title == null || title.trim().isEmpty()) return false;
       this.title = title.trim();
       return true;
   }

   String getTitle()
   {
      return title;
   }

   boolean borrowBy(Student borrower)
   {
       if (borrower == null) return false;
       this.borrower = borrower;
       return true;
   }

   String getBorrowerName()
   {
        if (borrower == null) return null;
        return borrower.getName();
   }
}
class LibraryDetails 
{
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
         Student student = new Student();
         LibraryBook book = new LibraryBook();

         System.out.print("Enter book title: ");

         String bookTitle = scanner.nextLine();
         
         if(!book.setTitle(bookTitle)){
            System.out.println("Title cannot be blank.");
            scanner.close();
            return;
         }

         System.out.print("Enter student name: ");

         String studentName = scanner.nextLine();

         if(!student.setName(studentName)){
            System.out.println("Student name cannot be blank.");
            scanner.close();
            return;
         }

         if(!student.borrowBook(book)){
            System.out.println("Borrow assignment failed.");
            scanner.close();
            return;
         }

         System.out.println("Title: " + book.getTitle());
         System.out.println("Borrower: " + book.getBorrowerName());
         scanner.close();        
         
    }
}