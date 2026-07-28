import java.util.*;
class MaxOfArray 
{
    int findMax(int[] arr)
    {
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            max = (max>arr[i])?max:arr[i];
        }
        return max;
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        MaxOfArray obj = new MaxOfArray();
        int maximumElement = obj.findMax(arr);
        System.out.println("The maximum element is: "+maximumElement);
        sc.close();
    }
}