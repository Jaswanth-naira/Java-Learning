import java.util.*;
class LargestElement 
{
    void findLargestElement(int[] arr)
    {
        int max = arr[0];
        for(int item : arr)
        {
              if (item > max) max = item;   
        }

        System.out.println("\nThe Largest element in the array is: " + max);
    }
    
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of an array: ");
         int size = sc.nextInt();

         int[] arr = new int[size];

         if(size > 0)
         {
               for(int i = 0; i < arr.length; i++)
               {
                   System.out.print("Enter element at index " + i + " : ");
                   arr[i] = sc.nextInt();
               }
      
               LargestElement obj = new LargestElement();
               obj.findLargestElement(arr);
         }

         else 
         {
              System.out.println("Invalid Size!!Please enter size greater than 0.");
         }
    }
}