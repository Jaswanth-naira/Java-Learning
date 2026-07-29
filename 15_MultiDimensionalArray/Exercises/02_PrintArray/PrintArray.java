import java.util.*;
class PrintArray 
{
    void fillArray(int[][] arr)
    {  
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    void printArray(int[][] arr)
    {
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
        System.out.print("Enter size of row: ");
        int rows = sc.nextInt();
        System.out.print("Enter size of column: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        PrintArray obj = new PrintArray();
        obj.fillArray(arr);
        obj.printArray(arr);

    }
}