import java.util.*;
class StoreData 
{
     void storeData(int[] arr)
     {
          Scanner sc = new Scanner(System.in);
          while (true)
          {
            System.out.print("Enter new element (-1 to stop): ");
            int newElement = sc.nextInt();
            if(newElement == -1) break;
            int[] temp = new int[arr.length+1];
            for(int j=0;j<arr.length;j++)
            {
                temp[j] = arr[j];
            }
             temp[arr.length] = newElement;
             arr = temp;
          }
          for(int i=0;i<arr.length;i++)
          {
            System.out.println(arr[i]);
          }
     }     
     
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        StoreData obj = new StoreData();
        
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
             System.out.print("Enter elements inside at index "+i+" : ");
             arr[i] = sc.nextInt();
        }

        obj.storeData(arr);

     }
}