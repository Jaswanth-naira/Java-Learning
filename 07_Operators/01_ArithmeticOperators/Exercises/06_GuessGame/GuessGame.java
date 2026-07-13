import java.util.*;
class GuessGame 
{
    public static void main(String args[])
    {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value of a: ");
          int a = sc.nextInt();

          System.out.print("Enter the value of b: ");
          int b = sc.nextInt();

          System.out.println(a/b);
          System.out.println(a%b);
          System.out.println((double)a/b);
          System.out.println(-a%b);
    }
}