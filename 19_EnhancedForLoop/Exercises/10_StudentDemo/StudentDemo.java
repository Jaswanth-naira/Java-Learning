import java.util.*;

class Student 
{
     String name;
     double marks;

     void printStudentDetails(Student[] arr)
     {
         System.out.println("\nPrinting Student Details: ");

         for(Student val: arr)
         {
              System.out.println("Name: " + val.name + ", Marks: " + val.marks);
         }
     }    



}

class StudentDemo 
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter no of students: ");
         int n = sc.nextInt();
         sc.nextLine();

         if(n>0)
         {
            Student[] arr = new Student[n];
            for(int i=0; i < arr.length; i++)
            {
                 arr[i] = new Student();
   
                 System.out.println("Enter details for Student " + (i + 1) + " : ");

                 System.out.print("Name: ");
                 String name = sc.nextLine();
                 arr[i].name = name;

                 System.out.print("Marks: ");
                 double marks = sc.nextDouble();
                 arr[i].marks = marks;
                 sc.nextLine();

            }
   
            Student obj = new Student();
            obj.printStudentDetails(arr);
         }

         else 
         {
            System.out.println("Invalid Size!!Please enter size greater than zero.");
         }
     }
}