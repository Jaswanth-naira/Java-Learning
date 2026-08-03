import java.util.*;
class ModifyElement 
{
       int[] deleteElement(int[] arr,int index)
       {
            for(int i=index;i<arr.length-1;i++)
            {
                 arr[i] = arr[i+1];
            }
            return arr;
       }
       public static void main(String args[])
       {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter size of an array: ");
          int size = sc.nextInt();
          int[] arr = new int[size];
          for(int i=0;i<size;i++)
          {
              System.out.print("Enter element inside an array at index: "+i+" : ");
              arr[i] = sc.nextInt();
          }
          System.out.print("Enter index element 0 to "+(arr.length -1)+" : ");
          int index = sc.nextInt();
          ModifyElement obj = new ModifyElement();
          int[] result = obj.deleteElement(arr,index);
          for(int i=0;i<arr.length;i++)
          {
            System.out.println(arr[i]);
          }

       }
}