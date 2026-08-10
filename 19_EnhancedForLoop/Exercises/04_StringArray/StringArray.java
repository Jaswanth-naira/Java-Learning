import java.util.*;
class StringArray 
{
    void printArray(String[] arr)
    {  
        for(String name : arr)
        {
            System.out.println("Name " + name + " | Length " + name.length());
        }

    }    
    
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of an array: ");
         int size = sc.nextInt();
         sc.nextLine();

         if(size > 0){
           String[] arr = new String[size];
           for(int i = 0; i <arr.length; i++)
           {
               System.out.print("Enter element at index " + i + " : ");
               arr[i] = sc.nextLine();
           }
           StringArray obj = new StringArray();
           obj.printArray(arr);
         }

         else {
            System.out.print("Invalid Size!! Please enter size greater than zero.");
         }
    }
}