import java.util.*;
class FindEvenNumber 
{
    int countEvenNumbers(int[] arr){
        int count = 0;
        for(int item: arr){
            if (item % 2 ==0) count++;
        }

        return count;
    }
    
    
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of an array: ");
         int size = sc.nextInt();

         int[] arr = new int[size];
         if(size > 0){
            for(int i = 0; i < arr.length; i++){
                 System.out.print("Enter element at index " + i + " : ");
                 arr[i] = sc.nextInt();
            }

             FindEvenNumber obj = new FindEvenNumber();
             int result = obj.countEvenNumbers(arr);
             System.out.println("The total no of even numbers in the list: " + result);
             
         }

         else {
            System.out.println("Invalid Size!! Please enter size greater than zero.");
         }
     }
}