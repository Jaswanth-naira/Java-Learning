import java.util.*;
class RangeCheck 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        boolean result = n>9 && n<21;
        System.out.println(result);
    }
}
