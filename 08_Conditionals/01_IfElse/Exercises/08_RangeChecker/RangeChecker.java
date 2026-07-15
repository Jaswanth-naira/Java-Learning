import java.util.*;
class RangeChecker 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        if ((10 <= number) && (number <= 20))
        {
            System.out.println("In range");
        }
        else 
        {
            System.out.println("Out of range");
        }

    }
}