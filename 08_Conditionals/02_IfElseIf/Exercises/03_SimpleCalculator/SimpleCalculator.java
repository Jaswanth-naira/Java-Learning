+import java.util.*;
class SimpleCalculator 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter any operator symbol: ");
        char operator = sc.next().charAt(0);

        if (operator == '+')
        {
            System.out.println(firstNumber + secondNumber);
        }
        else if (operator == '-')
        {
            System.out.println(firstNumber - secondNumber);
        }
        else if (operator == '*')
        {
            System.out.println(firstNumber * secondNumber);
        }
        else if (operator == '/')
        {   
            try
            {
                System.out.println(firstNumber /  secondNumber);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Enter second number other than zero");
            }
        }
        else if (operator == '%')
        {
             try
            {
                System.out.println(firstNumber %  secondNumber);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Enter second number other than zero");
            }
        }
        else 
        {
            System.out.println("Invalid Operator");
        }

    }
}