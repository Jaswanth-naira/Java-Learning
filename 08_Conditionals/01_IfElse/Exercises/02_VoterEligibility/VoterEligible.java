import java.util.*;
class VoterEligible 
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Voter's age: ");
        int age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("Eligible");
        }
        else 
        {
            System.out.println("Not Eligible");
        }
     }
}