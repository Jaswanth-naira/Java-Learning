import java.util.*;
class IncrementOperator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input value: ");

        int x = sc.nextInt();

        int y = x++ + ++x;   
        
        System.out.println(x+" "+y); 
    }
}