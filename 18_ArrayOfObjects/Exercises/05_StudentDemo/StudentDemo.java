import java.util.*;
class Student 
{
     String name;
     int marks[] = new int[3];

     void acceptDetails(Scanner sc)
     {
         System.out.print("Enter Student name: ");
         name = sc.nextLine();

         System.out.println("\n-----Enter student marks of 3 subjects------- ");
         for(int i=0;i<marks.length;i++)
         {
             System.out.print("Enter student marks obtained on subject-"+(i+1)+" : ");
             marks[i] = sc.nextInt();
         }
         sc.nextLine();
     }
       
    void findTotal()
      {
        int sum = 0;
        for(int i=0;i<marks.length;i++)
        {
             sum = sum+marks[i];
        }       
        System.out.println("The total marks obtained by student " + name + " : " + sum);
        
        findAverage(sum);
      }

     void findAverage(int sum)
     {
         double average = (double) sum / marks.length;
         System.out.println("The average marks obtained by student " + name + " : " + average+"\n");
     }

}

class StudentDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        sc.nextLine();
        if (size <=0 )
        {
            System.out.println("Invalid size! please enter number greater than 0.");
        }
        else
         {
             Student[] arr = new Student[size];
             for(int i=0;i<arr.length;i++)
             {
                  arr[i] = new Student();
                  System.out.println("\nEnter details of student " + (i+1) + ":");
                  arr[i].acceptDetails(sc);
             }
             System.out.println("\n ============= Student Result Summary ============");
    
             for(int i=0;i<arr.length;i++)
             {
                 System.out.println("Student " + (i + 1) + " Details : ");
                 arr[i].findTotal();
             }
        }
    }
}