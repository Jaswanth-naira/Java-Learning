import java.util.*;
class SumOf2DArray 
{ 
    int sum2D(int[][] arr)
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print("Enter element at row " + i +" , column " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        SumOf2DArray obj = new SumOf2DArray();
        int result = obj.sum2D(arr);
        System.out.println("Sum of all elements inside array is: "+result);
        sc.close();
    }
}