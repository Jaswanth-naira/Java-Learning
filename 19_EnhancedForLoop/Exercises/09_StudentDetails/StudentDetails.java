import java.util.*;
class StudentDetails 
{
    void printAboveSixty(double[] marks, String[] name)
    {
         int index = 0;
         boolean isAnyStudent = false;
         for(double mark : marks)
         {
             if(mark > 60)
             {
                 System.out.println(name[index]);
                 isAnyStudent = true;
             }
             index++;
         }

         if (!isAnyStudent) System.out.println("\nNo students have secured above 60 marks.");          
    }
    
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        if(n > 0)
        {
            double[] marks = new double[n];
            String[] name = new String[n];
            for(int i = 0; i < n; i++)
             {
                 
                 System.out.println("\nEnter details for Student " + (i + 1) + " : ");
                 System.out.print("Name: ");
                 name[i] = sc.nextLine(); 
                 System.out.print("Marks: ");
                 marks[i] = sc.nextDouble();
                 sc.nextLine();
             } 
           
            StudentDetails obj = new StudentDetails();
            obj.printAboveSixty(marks,name);
       }

       else 
       {
            System.out.println("Invalid size!!Please enter no of students greater than zero.");
       }


    }
}