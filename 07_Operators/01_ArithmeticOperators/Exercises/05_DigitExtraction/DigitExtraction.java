import java.util.*;
class DigitExtraction 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int number = sc.nextInt();

        int computedDigits = number%100; 

        int firstDigit = number/100;   
   
        int secondDigit = computedDigits/10; 
       
        int thirdDigit = computedDigits%10;

        System.out.println("First digit of the number: "+firstDigit);
        System.out.println("Second digit of the number: "+secondDigit);
        System.out.println("Third digit of the number: "+thirdDigit);
    }
}