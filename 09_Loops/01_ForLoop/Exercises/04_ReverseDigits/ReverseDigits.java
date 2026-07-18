import java.util.*;
class ReverseDigits 
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int no = sc.nextInt();
        int reversedNo = 0;
        for(int n=no; n>0;n=n/10)
        {
             int digit = n % 10;
             reversedNo = reversedNo * 10 + digit;
        }
        System.out.print(reversedNo);

     }
}      