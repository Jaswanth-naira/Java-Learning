import java.util.*;
class DivisibilityChecker 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int no = sc.nextInt();
        System.out.println( (no % 3 == 0 && no % 5 == 0) ? "Divisible by both" : (no % 3 == 0 ) ?  "Divisible by 3 but not 5" : (no % 5 == 0) ? "Divisible by 5 but not 3" : "Not divisible by both 3 and 5");
        
    }
}