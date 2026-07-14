import java.util.*;
class VotingEligibility 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter voter age: ");
        int age = sc.nextInt();
        System.out.println(age>=18);
    }
}