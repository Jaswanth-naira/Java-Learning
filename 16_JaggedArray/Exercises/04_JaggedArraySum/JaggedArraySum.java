import java.util.*;
class JaggedArraySum 
{
    int sumJagged(int[][] arr)
    {
        int sum = 0;
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
    System.out.print("Enter no of rows: ");
    int rows = sc.nextInt();
    int[][] arr = new int[rows][];
    for(int i=0;i<arr.length;i++)
    {
         System.out.print("Enter columns for row "+i+" : ");
         int columns = sc.nextInt();
         arr[i] = new int[columns];
         for(int j=0;j<arr[i].length;j++)
         {
              System.out.print("Enter element at row "+i+" column "+j+" : ");
              arr[i][j] = sc.nextInt();
         }
    }
    JaggedArraySum obj = new JaggedArraySum();
    int result = obj.sumJagged(arr);
    System.out.println("-----Printing the sum of Jagged3D array----\nThe sum of all elements of jagged array is : "+result);
    }
}