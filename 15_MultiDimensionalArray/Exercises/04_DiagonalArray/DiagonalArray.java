import java.util.*;
class DiagonalArray
{
    int diagonalSum(int[][] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+= arr[i][i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (nxn): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
             {
                System.out.print("Enter element at row "+i+" column "+j+": ");
                arr[i][j] = sc.nextInt();
             }
        }
        DiagonalArray obj = new DiagonalArray();
        int diagonalSumOfArray = obj.diagonalSum(arr);
        System.out.println(diagonalSumOfArray);
    }
}