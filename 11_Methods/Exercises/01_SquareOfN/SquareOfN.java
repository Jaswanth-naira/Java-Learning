import java.util.*;
class SquareOfN
{
    int square(int n)
    {
        return n*n;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SquareOfN obj = new SquareOfN();
        System.out.print("Enter any number: ");
        int n = sc.nextInt(); 

        int result = obj.square(n);
        System.out.println("Square of a number: "+result);

    }
}