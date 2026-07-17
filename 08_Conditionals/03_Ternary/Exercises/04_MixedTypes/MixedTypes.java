import java.util.*;
class MixedTypes 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        boolean flag = sc.nextBoolean();
        System.out.println(flag ? a : b); 

    }
}