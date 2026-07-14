import java.util.*;
class EvenOrOdd 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println(number % 2 == 0);
    }
}