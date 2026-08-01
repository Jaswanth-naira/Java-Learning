import java.util.*;
class TriangleArray 
{
    int[][] createTriangle(int n)
    {
         int[][] arr = new int[n][];
         for(int i=0;i<arr.length;i++)
         {
             int columns = i+1;
             arr[i] = new int[columns];
             for(int j=0;j<arr[i].length;j++)
             {
                 arr[i][j] = 1;
             }
         }
         return arr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        TriangleArray obj = new TriangleArray();
        int[][] result = obj.createTriangle(rows);
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j]+" ");
            }
          System.out.println();
        }
           
    }
}