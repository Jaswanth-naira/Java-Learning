import java.util.*;
class Student
{
     String name;
     double marks;


     void acceptDetails(Scanner sc, int studentNum)
     {
         System.out.println("\nEnter details for Student " + studentNum + ":");
         System.out.print(" -> Enter student name: ");
         name = sc.nextLine();

         System.out.print(" -> Enter student marks: ");
         marks = sc.nextDouble();
         sc.nextLine();
         System.out.println("----------------------------------------");
     }

     void swapStudentDetails(Student[] arr)
     {
          if(arr.length > 1)
          {
             System.out.println("\n========================================");
             System.out.println("     STUDENT DETAILS [ BEFORE SWAP ]    ");
             System.out.println("========================================");


             System.out.println("[First Student]");
             System.out.println("  Name  : " + arr[0].name);
             System.out.println("  Marks : " + arr[0].marks);

             
             System.out.println("\n[Last Student]");
             System.out.println("  Name  : " + arr[arr.length-1].name);
             System.out.println("  Marks : " + arr[arr.length-1].marks);
             System.out.println("----------------------------------------");

             Student temp = arr[0];
             arr[0] = arr[arr.length-1];
             arr[arr.length-1] = temp;

             
             System.out.println("\n========================================");
             System.out.println("     STUDENT DETAILS [ AFTER SWAP ]    ");
             System.out.println("========================================");

             System.out.println("[First Student]");
             System.out.println("  Name  : " + arr[0].name);
             System.out.println("  Marks : " + arr[0].marks);
             
             System.out.println("\n[Last student]");
             System.out.println("  Name  : " + arr[arr.length-1].name);
             System.out.println("  Marks : " + arr[arr.length-1].marks);
          }
          else  {
              System.out.println("\n[Error] Please enter a number of students greater than 1 to perform a swap. ");
          }

     }
}

class StudentSwap 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter no of students: ");
       int size = sc.nextInt();
       sc.nextLine();
     
       if(size < 1)
       {
           System.out.println("Invalid Size!! Please enter size greater than zero.");
           return;
       }
       
       Student[] arr = new Student[size];
       for(int i=0;i<arr.length;i++)
       {
           arr[i] = new Student();
           arr[i].acceptDetails(sc, i + 1);
       }

       Student obj = new Student();
       obj.swapStudentDetails(arr);
   }
}