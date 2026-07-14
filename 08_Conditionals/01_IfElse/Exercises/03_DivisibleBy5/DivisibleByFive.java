import java.util.*;
class DivisibleByFive 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input no: ");
        int no = sc.nextInt();
        if(no % 5 ==0)
        {
            System.out.println("Divisible by 5");
        }
        else 
        {
            System.out.println("Not Divisible by 5");
        }
    }
} 
