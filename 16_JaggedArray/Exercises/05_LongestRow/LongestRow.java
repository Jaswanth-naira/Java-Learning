import java.util.*;
class LongestRow 
{
    int longestRowLength(int[][] arr)
    {
         int max = 0;
         for(int i=0;i<arr.length;i++)
         {
                 max = (max > arr[i].length)? max : arr[i].length;
         }
         return max;
    }
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter no of rows: ");
         int rows = sc.nextInt();
         int[][] arr = new int[rows][];
         for(int i=0;i<arr.length;i++)
         {
             System.out.print("Enter no of columns at row "+i+" : ");
             int columns = sc.nextInt();
             arr[i] = new int[columns];
             for(int j=0;j<arr[i].length;j++)
             {
                  System.out.print("Enter element inside array at row "+i+" column "+j+" : ");
                  arr[i][j] = sc.nextInt();
             }
         }
         LongestRow obj = new LongestRow();
         int longestRow = obj.longestRowLength(arr);
         System.out.println(longestRow);
         sc.close();
    }
}