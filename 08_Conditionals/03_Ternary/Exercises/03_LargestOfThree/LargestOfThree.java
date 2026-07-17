import java.util.*;
class LargestOfThree 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.print("Enter first Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second Number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter third Number: ");
        int thirdNumber = sc.nextInt();

        int largest = (firstNumber>secondNumber)?(firstNumber>thirdNumber?firstNumber:thirdNumber):(secondNumber>thirdNumber?secondNumber:thirdNumber);
        System.out.println(largest);

    }
}