import java.util.*;
class PrintArray 
{
     void displayArray(int[] arr)
     {
         for(int item: arr)
         {
            System.out.println(item);
         }
     }
     
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of an array: ");
         int size = sc.nextInt();

         int[] arr = new int[size];
         
         for(int i = 0; i < arr.length; i++)
         {
             System.out.print("Enter element inside at index " + i + " : ");
             arr[i] = sc.nextInt();

         }
         PrintArray obj = new PrintArray();
         System.out.println("\nArray elements are: ");
         obj.displayArray(arr);


     }
}