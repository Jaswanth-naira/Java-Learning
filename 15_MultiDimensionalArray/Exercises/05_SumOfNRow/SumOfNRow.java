import java.util.*;
class SumOfNRow 
{
    int rowSum(int[][] arr,int rowIndex)
    {
        int sum = 0;
        for(int i=0;i<arr[rowIndex].length;i++)
        {
            sum += arr[rowIndex][i];
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
                System.out.print("Enter element at row "+i+" column "+j+" : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the index of row: ");
        int rowIndex = sc.nextInt();

        SumOfNRow obj = new SumOfNRow();
        int result = obj.rowSum(arr,rowIndex);
        
        System.out.println("Sum of row "+rowIndex+" is: "+result);
    }
}