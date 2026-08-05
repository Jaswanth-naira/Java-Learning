import java.util.*;
class CopyArray 
{
     void copyArray(int[] source,int[] dest)
     {
         Scanner sc = new Scanner(System.in);
         for(int i=0;i<source.length;i++)
          {
            System.out.print("Enter elements at index "+i+" : ");
            source[i] = sc.nextInt();
            dest[i] = source[i];
          }
          
     }
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the size of an array: ");
          int size = sc.nextInt();
          int[] arr = new int[size];
          int[] dest = new int[size];
          CopyArray obj = new CopyArray();
          obj.copyArray(arr,dest);
          dest[0] = 8;
          for(int i=0;i<arr.length;i++)
          {
              System.out.print(arr[i]+" ");
          }
          System.out.println();
          for(int i=0;i<dest.length;i++)
          {
             System.out.print(dest[i]+" ");
          }
        
     }
}