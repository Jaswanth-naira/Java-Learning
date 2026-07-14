import java.util.*;
class DoubleValues 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        double a = sc.nextDouble() + sc.nextDouble();
        double b = 0.3;
        System.out.println(a == b);
        System.out.println(a);        

    }
}