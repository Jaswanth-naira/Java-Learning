import java.util.*;
class ShortCircuit 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        if(x != 0 && (10 / x ) > 1 )
        {
            System.out.println("Condition is true");
        }
        else 
        {
            System.out.println("Condition is false");
        }
    }
}
