import java.util.*;
class Numbers1ToN 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int number = sc.nextInt();
        for(int i=1; i<=number; i++)
        {
            System.out.println(i);
        }
    }
}