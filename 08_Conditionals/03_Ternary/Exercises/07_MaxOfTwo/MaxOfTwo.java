import java.util.*;
class MaxOfTwo 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println((firstNumber>secondNumber)? (firstNumber%2 ==0 ? firstNumber*2: firstNumber) : (secondNumber%2 == 0 ? secondNumber*2:secondNumber));
        
    }
}