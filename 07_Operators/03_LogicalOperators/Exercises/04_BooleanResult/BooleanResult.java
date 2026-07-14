import java.util.*;
class BooleanResult 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        boolean result = (x != 0) & (10 / x > 1);
        System.out.println(result);
    }
}