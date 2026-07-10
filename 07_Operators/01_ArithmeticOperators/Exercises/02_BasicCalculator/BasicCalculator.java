import java.util.*;
class BasicCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int firstInput = sc.nextInt();

        System.out.println("Enter second integer: ");
        int secondInput = sc.nextInt();

        System.out.println("The sum of two numbers: "+(firstInput+secondInput));
        System.out.println("The difference of two numbers: "+(firstInput-secondInput));
        System.out.println("The product of two numbers: "+(firstInput*secondInput));
        System.out.println("The quotient value: "+(firstInput/secondInput));
        System.out.println("The remainder value: "+(firstInput%secondInput));
    }
}