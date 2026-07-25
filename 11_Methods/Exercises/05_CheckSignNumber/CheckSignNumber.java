import java.util.*;
class CheckSignNumber 
{
    static String checkSign(int n)
    {
        if(n > 0)
        {   
            return "Positive";
        }
        System.out.println("This line runs only for non positive - numbers");
        return "Non-positive";
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        checkSign(n);
        
    }
}