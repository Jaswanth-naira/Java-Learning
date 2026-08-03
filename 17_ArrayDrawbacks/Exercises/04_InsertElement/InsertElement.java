import java.util.*;
class InsertElement 
{
    int[] insertAt(int[] arr,int index,int value)
    {
        int[] newArr = new int[arr.length+1];
        for(int i = 0; i < index; i++)
        {
             newArr[i] = arr[i];
        }
        newArr[index] = value;
        for(int i=index; i<arr.length;i++)
        {
            newArr[i+1] = arr[i];
        }
            
        return newArr;
    }
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of an array: ");
         int size = sc.nextInt();
         int[] arr = new int[size];
         for(int i=0;i<size;i++)
         {
             System.out.print("Enter elements inside an array at index "+i+" : ");
             arr[i] = sc.nextInt();
         }
         System.out.print("Enter index no you want to insert from 0 to "+(arr.length)+" : ");
         int index = sc.nextInt();
         System.out.print("Enter value you want to insert: ");
         int value = sc.nextInt();
         InsertElement obj = new InsertElement();
         int[] newestArray = obj.insertAt(arr,index,value);
         
         for(int i=0;i<newestArray.length;i++)
         {
              System.out.println(newestArray[i]);
         }

    }
}