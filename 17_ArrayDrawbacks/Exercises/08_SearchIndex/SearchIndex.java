import java.util.*;
class SearchIndex 
{
    int search(int[] arr,int key)
    {
         int value = 0;
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i] == key)
             {
                 return i;
             }
         }
         return -1;
    
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
             System.out.print("Enter elements inside an array at index "+i+" : ");
             arr[i] = sc.nextInt();
        }
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        SearchIndex obj = new SearchIndex();
        int result = obj.search(arr,value);
        System.out.println(result);        
    }
}