class PrintJaggedArray 
{
      int[][] createJaggedArray()
      {
          int[][] jaggedArray = {
                    {1,2},
                    {3,4,5,6},
                    {7}
                 };
        return jaggedArray;
      }     
     
     
      public static void main(String args[])
      {
           PrintJaggedArray obj = new PrintJaggedArray();
           int[][] result = obj.createJaggedArray();
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