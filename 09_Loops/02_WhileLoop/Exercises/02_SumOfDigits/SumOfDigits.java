import java.util.*;
class SumOfDigits 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int no = sc.nextInt();
        int totalSumOfDigits = 0;
        while(no>0)
        {
              totalSumOfDigits = totalSumOfDigits + no%10;
              no = no/10; 
        }
       System.out.println(totalSumOfDigits);
    }
}