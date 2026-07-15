import java.util.*;
class Triangle 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of first side in a  triangle: ");
        int firstSide = sc.nextInt();
        System.out.print("Enter length of second side in a triangle: ");
        int secondSide = sc.nextInt();
        System.out.print("Enter length of third side in a triangle: ");
        int thirdSide = sc.nextInt();

        int sum = 0;
        if ((firstSide + secondSide > thirdSide ) && (firstSide + thirdSide > secondSide) && (secondSide + thirdSide > firstSide) ) 
        {
            sum += 1;
        }

        if(sum > 0)
        {
            System.out.println("Valid triangle");
        }
        else 
        {
            System.out.println("Not a Valid triangle ");
       }
    }
}