import java.util.*;
class AverageOfNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total no of integers: ");
        double total = sc.nextDouble();

        System.out.print("Enter first integer: ");
        int firstInteger = sc.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = sc.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInteger = sc.nextInt();

        double result = (firstInteger+secondInteger+thirdInteger)/total;

        System.out.println(result);
    }
}