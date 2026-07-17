import java.util.*;
class EvenOrOdd 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int no = sc.nextInt();
        System.out.println(no%2==0 ? "Even":"Odd");
        
    }
}