import java.util.*;
class Student
{
      int id;
      String name;
      double marks;

      void acceptDetails(Scanner sc)
      {
           System.out.print("Enter student id: ");
           id = sc.nextInt();
           sc.nextLine();

           System.out.print("Enter student name: ");
           name = sc.nextLine();

           System.out.print("Enter student marks: ");
           marks = sc.nextDouble(); 
      }

      void displayDetails()
      {
          System.out.print("Student id "+id+" Student name "+name+" Student marks "+marks);
          System.out.println();
      }
}
class StudentDetails 
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         Student[] arr = new Student[3];
         for(int i=0;i<arr.length;i++)
         {
             arr[i] = new Student();
             System.out.println("Enter details of student "+(i+1));
             arr[i].acceptDetails(sc);  
         }
         System.out.print("\n----Printing Student Details----\n");
         for(int i=0;i<arr.length;i++)
         {
             arr[i].displayDetails();
         }

     }
}