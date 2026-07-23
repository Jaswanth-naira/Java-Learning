import java.util.*;
class RangeCheck 
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter any number: ");
         int n = sc.nextInt();
         while(n>0)
         {
            System.out.println(n);
            n--;
         }
     }
}