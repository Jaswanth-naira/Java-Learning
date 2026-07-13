import java.util.*;
class CompoundOperator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        n += 5;
        n -= 3;
        n *= 2 ;
        n /= 4;
        n %= 4;
        System.out.println(n);
    }
}