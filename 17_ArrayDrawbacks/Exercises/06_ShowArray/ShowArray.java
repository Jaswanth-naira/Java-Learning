import java.util.*;
class ShowArray 
{
    void showArray(int[] arr)
    {
         Scanner sc = new Scanner(System.in);
         for(int i=0;i<2;i++)
         {
             System.out.print("Enter element "+ i+" inside an array: ");
             arr[i] = sc.nextInt();
         }
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        ShowArray obj = new ShowArray();
        obj.showArray(arr);
        

    }
}