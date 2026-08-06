import java.util.*;
class AverageOfArray 
{
    double findAverage(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
             sum = sum+arr[i];
        }
        return (double) sum/arr.length;
        
    }
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         int[] arr = new int[5];
         System.out.print("Enter how many values you would like to enter: ");
         int noOfValues = sc.nextInt();
         for(int i=0;i<noOfValues;i++)
         {
              System.out.print("Enter elements at index "+i+" : ");
              arr[i] = sc.nextInt();
         }
         AverageOfArray obj = new AverageOfArray();
         double result = obj.findAverage(arr);
         System.out.println(result);
    }
}