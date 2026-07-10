import java.util.*;
class ArithmeticOperators 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input value of a:");
        int a = sc.nextInt();
        
        System.out.println("Enter the input value of b:");
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}