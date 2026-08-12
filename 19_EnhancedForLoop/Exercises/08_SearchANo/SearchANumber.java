import java.util.*;
class SearchANumber 
{
      boolean findNumber(int[] arr, int userEnteredNo)
      {
           for(int item: arr)
           {
               if(item == userEnteredNo) return true;
           }
           return false;
      }
      
      public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter size of an array: ");
          int size = sc.nextInt();

          if(size > 0)
          {
                int[] arr = new int[size];
      
                for(int i = 0; i < arr.length; i++)
                {
                     System.out.print("Enter input at index " + i + " : ");
                     arr[i] = sc.nextInt();
                }
                
                System.out.print("Enter the number you want to search : ");
                int userEnteredNo = sc.nextInt();
               
                SearchANumber obj = new SearchANumber();
                boolean found = obj.findNumber(arr,userEnteredNo);
      
                if (found)
                {
                     System.out.println(userEnteredNo + " exists in the array. ");
                }
                else 
                {
                     System.out.println(userEnteredNo + " does not exist in the array. ");
                }
          }

          else 
          {
              System.out.println("Invalid Size!! Please enter size greater than zero.");
          }
      }
}