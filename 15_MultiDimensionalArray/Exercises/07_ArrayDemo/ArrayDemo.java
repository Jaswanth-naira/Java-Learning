class ArrayDemo 
{
    public static void main(String args[])
    {
        int[][] a = {{1,2},{3,4}};
        int[] row = a[0];
        row[0]  = 99;
        System.out.println(a[0][0]);
    }
}