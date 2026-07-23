import java.util.*;
class GCD 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        while(b!=0)
        {
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println(a);
    }
}