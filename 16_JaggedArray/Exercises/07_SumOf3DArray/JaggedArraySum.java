import java.util.*;
class JaggedArraySum 
{
    int sum3D(int[][][] cube)
    {
        int sum = 0;
        for(int i=0;i<cube.length;i++)
        {
            for(int j=0;j<cube[i].length;j++)
            {
                for(int k=0;k<cube[i][j].length;k++)
                {
                      sum += cube[i][j][k];
                }
            }
        }
        return sum;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of blocks you wish for array: ");
        int blocks = sc.nextInt();
        int[][][] arr= new int[blocks][][];
        for(int i=0;i<arr.length;i++)
        {
              System.out.print("Enter no of rows at block "+(i+1)+" : ");
              int rows = sc.nextInt();
              arr[i] = new int[rows][];
              for(int j=0;j<arr[i].length;j++)
              {
                System.out.print("Enter no of columns at row "+(j+1)+" block "+(i+1)+" : ");
                int columns = sc.nextInt();
                arr[i][j] = new int[columns];
                for(int k=0;k<arr[i][j].length;k++)
                {
                     System.out.print("Enter elements inside block "+(i+1)+" at row "+(j+1)+" column "+(k+1)+" : ");
                     arr[i][j][k] = sc.nextInt();
                }
              }
        }
        JaggedArraySum obj = new JaggedArraySum();
        int sumOf3DArray = obj.sum3D(arr);
        System.out.println("The total sum of all elements inside 3D jagged array is: "+sumOf3DArray);
        sc.close();
    }
}