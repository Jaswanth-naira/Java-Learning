import java.util.*;
class AverageMarks 
{
     double averageMarks(double[] arr)
     {
          double average = 0.0;
          for(double marks : arr)
          {
             average = marks + average;
          }
          average = average / arr.length;
          return average;
     }

     void printAboveAverageMarks(double[] arr, double result)
     {
        int count = 0;
        for(double marks : arr)
        {
             if (marks > result) count++;
        }

        System.out.println("Average mark is: " + result);
        System.out.println("Number of marks above average: " + count);
     }
     
     
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of an array: ");
         int size = sc.nextInt();

         if(size > 0){
             double[] arr = new double[size];
             for(int i = 0; i < arr.length; i++)
             {
                 System.out.print("Enter marks at index " + i + " : ");
                 arr[i] = sc.nextDouble();
             }
             
             AverageMarks obj = new AverageMarks();
             double result = obj.averageMarks(arr); 
             obj.printAboveAverageMarks(arr,result);  
         }    

         else {
            System.out.println("Invalid Size!! Please enter size greater than zero.");
         }   
     }
}
