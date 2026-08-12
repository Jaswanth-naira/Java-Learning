import java.util.*;
class ReverseArray 
{
     void reverse(int[] arr)
     { 
           for(int i = 0; i < arr.length / 2; i++)
           {
                int temp = arr[i];    

                arr[i] = arr[arr.length - i - 1];    

                arr[arr.length - i -1] = temp;       
                 
           }
     }
     
     void printArray(int[] arr)
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

         if(size > 0){
             int[] arr = new int[size];
    
             for(int i = 0; i < arr.length; i++)
             {
                  System.out.print("Enter input at index " + i + " : ");
                  arr[i] = sc.nextInt();
             }
    
             ReverseArray obj = new ReverseArray();
             obj.reverse(arr);
             obj.printArray(arr);
         }

         else{
            System.out.println("Invalid Size!! Please enter size greater than zero.");
         }
       
     }
}