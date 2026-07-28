import java.util.*;
class SumOfArray
{
    public static int SumArray(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        { 
            sum += arr[i];  
        }

        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter element "+(i + 1)+": ");
            arr[i] = sc.nextInt();
        }
        int sum=SumArray(arr);
        System.out.println("Sum of all the elements inside an array: "+sum);   
            
    }

}