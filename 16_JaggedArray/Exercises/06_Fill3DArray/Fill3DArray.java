import java.util.*;
class Fill3DArray 
{
    void fill3D(int[][][] cube)
    {  
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<cube.length;i++)
        {
             System.out.print("Enter no of rows at block "+ (i+1) +" : ");
             int rows = sc.nextInt();
             cube[i] = new int[rows][];
             for(int j=0;j<cube[i].length;j++)
             {
                 System.out.print("Enter no of columns at block "+ (i+1) +" row "+j+" : ");
                 int columns = sc.nextInt();
                 cube[i][j] = new int[columns];
                 for(int k=0;k<cube[i][j].length;k++)
                 {
                    System.out.print("Enter element inside block "+ (i+1) + " at row "+j+" column "+k+" : ");
                    cube[i][j][k] = sc.nextInt();
                 }

             }

        }
        System.out.println();
        
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of blocks you wish to have in an array: ");
        int blocks =sc.nextInt();
        int[][][] arr = new int[blocks][][];
        Fill3DArray obj = new Fill3DArray();
        obj.fill3D(arr);
        
        for(int i=0;i<arr.length;i++)
        {
             System.out.print("Printing Jagged Array "+(i+1)+" : \n");
             for(int j=0;j<arr[i].length;j++)
             {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
             }
        }


    }
}