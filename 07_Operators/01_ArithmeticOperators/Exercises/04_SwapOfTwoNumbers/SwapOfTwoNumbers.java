import java.util.*;
class SwapOfTwoNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        x = x + y; 
        
        y = x - y;

        x = x- y;

        System.out.println("After swapping: ");
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }
}