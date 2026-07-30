import java.util.*;
class Transpose2D 
{
    int[][] transposeArray(int[][] arr)
    {
        int rows = arr.length;
        int columns = arr[0].length;
        int[][] newArr = new int[columns][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)                               
            {                                                                        
                newArr[j][i] = arr[i][j];                                                                                
            }                                                                
        }                                                                  
        return newArr;                                                       
    }                                                                    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns: ");
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
       Transpose2D obj = new Transpose2D();
       int[][] result = obj.transposeArray(arr);

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