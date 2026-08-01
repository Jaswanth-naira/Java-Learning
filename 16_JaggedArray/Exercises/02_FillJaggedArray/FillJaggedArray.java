import java.util.*;
class FillJaggedArray 
{
     void fillJagged(int[][] arr)
     {
          Scanner sc = new Scanner(System.in);
          for(int i=0;i<arr.length;i++)
          {
               System.out.print("Enter no of columns of "+i+" row: ");
               int columns = sc.nextInt();
               arr[i] = new int[columns];
               for(int j=0;j<arr[i].length;j++)
               {
                   System.out.print("Enter element inside "+i+" row "+j+" column: ");
                   arr[i][j] = sc.nextInt();
               }
          }
          System.out.println("\n-------The Jagged Array Elements-----");
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
     }
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the no of rows: ");
         int rows = sc.nextInt();
         int[][] arr = new int[rows][];
         FillJaggedArray obj = new FillJaggedArray();
         obj.fillJagged(arr);
     }
}