import java.util.*;
class Factorial 
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any  number : ");
         int no = sc.nextInt();
         int result=1;
         for (int i = no; i>0; i--)
         {
              result = result*i;
         }
         System.out.println(result);
    }
}