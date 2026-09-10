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
       if(borrower == null) return false;
       this.borrower = borrower;
       return true;
    } 

    String getBorrowerName()
    {
       if(borrower == null) return null;
       
       return borrower.getName();
    }

}

class StudentLibrary 
{
     public static void main(String args[])
     {
          Scanner scanner = new Scanner(System.in);
          Student student = new Student();
          LibraryBook book = new LibraryBook();
          
          System.out.print("Enter book title: ");
          String bookTitle = scanner.nextLine();

          if(!book.setTitle(bookTitle)){
               System.out.println("Invalid Input! Book title cannot be blank.");
               scanner.close();
               return;
          }

          System.out.print("Enter student's name: ");
          String studentName = scanner.nextLine();
          if(!student.setName(studentName)){
               System.out.println("Invalid Input! Student name cannot be blank.");
               scanner.close();
               return;
          }

          if(!book.borrowBy(student)){
             System.out.println("Borrower assignment failed.");
             scanner.close();
             return;
          }

          System.out.println("Book: " + book.getTitle());
          System.out.println("Borrower: " + book.getBorrowerName());
          scanner.close();
     }
}