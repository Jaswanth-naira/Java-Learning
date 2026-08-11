import java.util.*;
class ArraySum 
{
    int sumOfArray(int[][] arr)
    {
         int sum = 0;
         for(int[] row : arr)
         {
            for(int column: row)
            {
                sum = sum + column;
            }
         }
         return sum;
    }
    
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter no of rows: ");
         int rows = sc.nextInt();

         System.out.print("Enter no of columns: ");
         int columns = sc.nextInt();

        
        if(rows <=0 || columns <=0){
            System.out.println("Rows and columns size must be greater than zero. ");
            return;
        }
        else{
         int[][] arr = new int[rows][columns];

         for(int i = 0; i <  arr.length; i++)
         {
             for(int j = 0; j < arr[i].length; j++)
             {
                 System.out.print("Enter element at row " + i + " column " + j + " : ");
                 arr[i][j] = sc.nextInt();
             } 
         }
        
        ArraySum obj = new ArraySum();
        int sum = obj.sumOfArray(arr);
        System.out.println("Sum of all array elements is: " + sum);
        }
    }
}