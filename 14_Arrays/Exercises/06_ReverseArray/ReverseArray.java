import java.util.*;
class ReverseArray 
{
    void reverseArray(int[] arr)
    {
          int rotation = arr.length/2;
          for(int i=0;i<rotation;i++)
          {
              int temp = arr[i];
              arr[i] = arr[arr.length-i-1];
              arr[arr.length-i-1] = temp;
          }
         
    }                             
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
             System.out.print("Enter element "+(i+1)+": ");
             arr[i]= sc.nextInt();
        }
        ReverseArray obj = new ReverseArray();
        obj.reverseArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}